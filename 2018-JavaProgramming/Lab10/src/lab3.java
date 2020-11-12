import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
class MyFrame4 extends JFrame{
	public MyFrame4() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel=new JPanel();
		JLabel label=new JLabel("Hello?");
		JButton button=new JButton("HELLO");
		
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1);
		panel.add(t2);
		
		panel.add(label);
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
}
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame4 f=new MyFrame4();
	}

}
