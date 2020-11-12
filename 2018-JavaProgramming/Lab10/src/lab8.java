import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

class MyFrame10 extends JFrame{
	public MyFrame10() {
		setTitle("BoxLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel,"Button1");
		makeButton(panel,"Button2");
		makeButton(panel,"Button3");
		makeButton(panel,"B4");
		makeButton(panel,"Long Button5");
		
		add(panel);
		
		pack();
		setVisible(true);
	}
	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(CENTER_ALIGNMENT);
		panel.add(button);
	}
}
public class lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame10 f=new MyFrame10();
	}

}
