package week10;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(5,4)); //(За,ї­)
		
		JTextField field=new JTextField();
		field.setHorizontalAlignment(JTextField.RIGHT);
		
		makeButton(panel,"ON");
		makeButton(panel,"AC");
		makeButton(panel,"C");
		makeButton(panel,"OFF");
		
		makeButton(panel,"7");
		makeButton(panel,"8");
		makeButton(panel,"9");
		makeButton(panel,"/");
		
		makeButton(panel,"4");
		makeButton(panel,"5");
		makeButton(panel,"6");
		makeButton(panel,"X");
		
		makeButton(panel,"1");
		makeButton(panel,"2");
		makeButton(panel,"3");
		makeButton(panel,"-");
		
		makeButton(panel,"0");
		makeButton(panel,".");
		makeButton(panel,"=");
		makeButton(panel,"+");
		
		setLayout(new BorderLayout());
		add(field,BorderLayout.PAGE_START);
		
		add(panel);
		pack();
		setVisible(true);
	
	}
	public void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
}

public class lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f=new MyFrame();
	}

}
