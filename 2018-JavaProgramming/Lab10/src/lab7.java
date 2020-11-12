import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

class MyFrame9 extends JFrame{
	public MyFrame9() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(0,3));
		
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		
		add(panel);
		pack();
		setVisible(true);
	}
}
public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame9 f=new MyFrame9();
	}

}
