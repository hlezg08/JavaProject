import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	JTextField kor,eng,math;
	JButton button;
	JPanel p1,drawpanel;
	JLabel label;

	public MyFrame2() {
		setTitle("Score Graph-������");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel l1=new JLabel("Kor");
		kor=new JTextField(5);
		JLabel l2=new JLabel("Eng");
		eng=new JTextField(5);
		JLabel l3=new JLabel("Math");
		math=new JTextField(5);
		button=new JButton("Show Graph"); //���̺�,�ؽ�Ʈ�ʵ�,��ư �߰�
		
		label=new JLabel();
		p1=new BackPanel();
		drawpanel=new DrawPanel();
		JPanel p2=new JPanel();
		
		p2.add(l1);
		p2.add(kor);
		p2.add(l2);
		p2.add(eng);
		p2.add(l3);
		p2.add(math);
		p2.add(button); //���̺�,�ؽ�Ʈ�ʵ�,��ư���� �� �гο� �߰��ϱ�
		
		add(p1);
		add(p2,BorderLayout.PAGE_END);
		button.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			try {
				if(Integer.parseInt(kor.getText())>=0&&Integer.parseInt(eng.getText())>=0&&Integer.parseInt(math.getText())>=0) {
					add(drawpanel);
					setVisible(true);//��ư ������ �� �׷��� �׷��ֱ�
				}
				else
					throw new NumberFormatException();
			}
			catch(NumberFormatException a) {
				label.setText("Wrong Input");
				add(label,BorderLayout.PAGE_START);
				setVisible(true); //���� �̿ܿ� �ٸ��� �Է������� ó��
			}
		}
		
	}
	class BackPanel extends JPanel{ //�׷��� �׸��� ���� ��� �г�
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawLine(50, 250, 350, 250);
			for(int i=1;i<11;i++) {
				g.drawString(i*10+"",25,255-20*i);
				g.drawLine(50, 250-20*i, 350, 250-20*i);
			}//�׷��� �� �׷��ֱ�
			g.drawLine(50,20,50,250);
			g.drawString("KOR", 100, 270);
			g.drawString("ENG", 200, 270);
			g.drawString("MATH", 300, 270);

		}
	}
	class DrawPanel extends JPanel{//�׷��� �׷��ִ� �г�
		public void paintComponent(Graphics g) {
			int korean=Integer.parseInt(kor.getText());
			int english=Integer.parseInt(eng.getText());
			int Math=Integer.parseInt(math.getText());//�ؽ�Ʈ�ʵ忡 �Է¹��� ������ ���������� ��ȯ
			super.paintComponent(g);
			g.clearRect(0, 0, getWidth(), getHeight());
			g.drawLine(50, 250, 350, 250);
			for(int i=1;i<11;i++) {
				g.drawString(i*10+"",25,255-20*i);
				g.drawLine(50, 250-20*i, 350, 250-20*i);
			}
			g.drawLine(50,20,50,250);
			g.drawString("KOR", 100, 270);
			g.drawString("ENG", 200, 270);
			g.drawString("MATH", 300, 270);
			
			g.setColor(Color.red);
			if(korean>0)
				g.fillRect(110, 250-2*korean, 10, korean*2);
			if(english>0)
				g.fillRect(210, 250-2*english, 10, english*2);
			if(Math>0)
				g.fillRect(310, 250-2*Math, 10, Math*2);//������ �°� �׷�����ĥ�ϱ�	
	
		}
	}	
}
public class num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}
	//��ǻ�Ͱ��� 1771028 ������
}
