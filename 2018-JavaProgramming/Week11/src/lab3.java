import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
	private JButton button;
	public MyFrame() {
		this.setSize(300,200);
		this.setTitle("Event Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		button=new JButton("Press the Button");
		
		button.addActionListener(this);
		
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			button.setText("Button Pressed");
		}
	}
}
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t=new MyFrame();
	}

}
