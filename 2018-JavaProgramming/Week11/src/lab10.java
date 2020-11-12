import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Frame2 extends JFrame{
	private JButton confirm,reset;
	private JTextField t1,t2,t3;
	private JLabel label; //actionListener 구현할때 사용되는 변수들? private로 설정해놓는거 까먹으면 안됨!
	
	public Frame2() {
		setTitle("Add Test");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel p1=new JPanel();
		
		t1=new JTextField(5);
		JLabel l1=new JLabel("+");//l1,l2는 private안해도 잘돌아감
		t2=new JTextField(5);
		JLabel l2=new JLabel("=");
		t3=new JTextField(5);
		
		p1.add(t1);
		p1.add(l1);
		p1.add(t2);
		p1.add(l2);
		p1.add(t3);
		
		JPanel p2=new JPanel();
		confirm=new JButton("Confirm");
		confirm.addActionListener(new MyAction());
		reset=new JButton("New");
		reset.addActionListener(new MyAction());
		
		p2.add(confirm);
		p2.add(reset);
		
		JPanel p3=new JPanel();
		label=new JLabel("새로운 데이터를 입력하세요.");
		p3.add(label);
		
		add(p1,BorderLayout.PAGE_START);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.PAGE_END);
		//JLabel text3=new JLabel
		
		setVisible(true);
	}
	class MyAction implements ActionListener{

		public void actionPerformed(ActionEvent a) {
			try {
				if(a.getSource()==confirm) {
					int result=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
					t3.setText(Integer.toString(result));
					label.setText("두 숫자를 더한 결과입니다.");
				}
				if(a.getSource()==reset) {
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					label.setText("새로운 데이터를 입력하세요.");
				}
			}
			catch(Exception e) {
				label.setText("잘못된 입력! 데이터를 다시 입력하세요.");
			}
		}
	}
}
public class lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame2 f=new Frame2();
	}

}
