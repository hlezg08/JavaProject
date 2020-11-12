package week10;
import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("Stduent Information");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel p1=new JPanel();
		JLabel label=new JLabel("STUDENT INFORMATION");
		p1.add(label);
		add(p1,BorderLayout.PAGE_START);
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(4,2));
		p2.add(new JLabel("NAME"));
		p2.add(new JTextField(10));
		p2.add(new JLabel("Gender"));
		
		
		JPanel p3=new JPanel();
		p3.add(new JRadioButton("Male"));
		p3.add(new JRadioButton("Female"));
		p2.add(p3);
		
		p2.add(new JLabel("ID"));
		p2.add(new JTextField(10));
		p2.add(new JLabel("DEPARTMENT"));
		p2.add(new JTextField(10));
		
		add(p2,BorderLayout.CENTER);
		
		JPanel p4=new JPanel();
		p4.add(new JButton("Save"));
		p4.add(new JButton("Cancel"));
		add(p4,BorderLayout.PAGE_END);
		
		pack();
		setVisible(true);
	}
}
public class lab11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 f=new MyFrame2();
	}

}
