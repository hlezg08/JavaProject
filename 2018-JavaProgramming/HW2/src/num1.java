import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	Font f1,f2,f3,f4;
	JTextField t1,t2,t3,t4;
	JButton button;
	JPanel p1;
	JLabel label;
	public MyFrame() {
		setTitle("성씨에 대한 파이차트 그리기 - 성혜린");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1=new MyPanel();
		JPanel p2=new JPanel();
		f1=new Font("TimesRoman",Font.PLAIN,10);
		f2=new Font("TimesRoman",Font.PLAIN,10);
		f3=new Font("TimesRoman",Font.PLAIN,10);
		f4=new Font("TimesRoman",Font.PLAIN,10);
		
		JLabel l1=new JLabel("김");
		t1=new JTextField(5);
		JLabel l2=new JLabel("이");
		t2=new JTextField(5);
		JLabel l3=new JLabel("박");
		t3=new JTextField(5);
		JLabel l4=new JLabel("그 외");
		t4=new JTextField(5);
		button=new JButton("확인");
		button.addActionListener(this);
		label=new JLabel();//레이블,텍스트필드,버튼 삽입
		
		p2.add(l1);
		p2.add(t1);
		
		p2.add(l2);
		p2.add(t2);
		
		p2.add(l3);
		p2.add(t3);
		
		p2.add(l4);
		p2.add(t4);
		p2.add(button); //레이블,텍스트필드,버튼들을 한 패널에 추가
		
		add(p2,BorderLayout.PAGE_END); //패널을 프레임에 넣고 레이아웃을 설정
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		try {
			int n1=Integer.parseInt(t1.getText()); 
			int n2=Integer.parseInt(t2.getText());
			int n3=Integer.parseInt(t3.getText());
			int n4=Integer.parseInt(t4.getText());//텍스트필드에 넣었던 숫자들을 반환해서 정수형으로 만들기
			if(n1+n2+n3+n4 >100) {
				label.setText("전체 학생 수는 100명입니다.");
				add(label);
				remove(p1);
				setVisible(true);
				t1.setText("0");
				t2.setText("0");
				t3.setText("0");
				t4.setText("0"); //학생수가 100명을 넘겼을 때 전부다 0으로 반환
			}
			else if(n1+n2+n3+n4<=100){
				if(e.getSource()==button) {
					add(p1);
					remove(label);
					repaint();
					setVisible(true);	//학생수가 100명을 넘기지않았을때 파이차트 그려주기
				}
			}
			else {
				throw new NumberFormatException(); //그외 다른 문자를 입력했을때
			}
			
		}
		catch(NumberFormatException a) {
			label.setText("학생의 수를 입력하세요.");
			add(label);
			remove(p1);
			setVisible(true);
			t1.setText("0");
			t2.setText("0");
			t3.setText("0");
			t4.setText("0");//그외 다른 문자를 입력했을때 0으로 다 반환
		}
		
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.setFont(f1);
			g.drawString("빨강색: 김", 400, 100);
			double arc1=Double.parseDouble(t1.getText());
			g.fillArc(100, 100, 200, 200, 0, (int)(arc1*3.6)); //김씨 성 그림 그리기
			
			g.setColor(Color.yellow);
			g.setFont(f2);
			g.drawString("노랑색: 이", 400, 120);
			double arc2=Double.parseDouble(t2.getText());
			g.fillArc(100, 100, 200, 200, (int)(arc1*3.6), (int)(arc2*3.6)); //이씨 성 그림 그리기
			
			g.setColor(Color.blue);
			g.setFont(f3);
			g.drawString("파랑색: 박", 400, 140);
			double arc3=Double.parseDouble(t3.getText());
			g.fillArc(100, 100, 200, 200, (int)(arc1*3.6)+(int)(arc2*3.6), (int)(arc3*3.6));
			//박씨 성 그림 그리기
			
			g.setColor(Color.green);
			g.setFont(f4);
			g.drawString("초록색: 그외", 400, 160);
			double arc4=Double.parseDouble(t4.getText());
			g.fillArc(100, 100, 200, 200, (int)(arc1*3.6)+(int)(arc2*3.6)+(int)(arc3*3.6), (int)(arc4*3.6));
			//그외 성 그림 그리기
		}
	}
}

public class num1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
//컴퓨터공학 1771028 성혜린
}
