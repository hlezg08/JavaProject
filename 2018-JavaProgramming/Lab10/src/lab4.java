import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

class RadioButtonFrame extends JFrame{
	private JTextField textfield;
	private JRadioButton RB1;
	private JRadioButton RB2;
	private JRadioButton RB3;
	private JRadioButton RB4;
	
	public RadioButtonFrame() {
		super("RadioButton Test");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		
		textfield=new JTextField("Radio Button Example",25);
		add(textfield);
		
		RB1=new JRadioButton("RB1");
		RB2=new JRadioButton("RB2");
		RB3=new JRadioButton("RB3");
		RB4=new JRadioButton("RB4",true);
		add(RB1);
		add(RB2);
		add(RB3);
		add(RB4);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(RB1);
		bg.add(RB2);
		bg.add(RB3);
		bg.add(RB4);
		
		setVisible(true);
	}
}
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtonFrame rbf=new RadioButtonFrame();
	}

}
