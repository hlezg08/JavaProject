import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame11 extends JFrame implements ActionListener{
	JPanel panel;
	Cards cards;
	
	public MyFrame11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CardLayoutTest");
		setSize(400,200);
		
		panel=new JPanel(new GridLayout(0,5,10,0));
		
		addButton("<<",panel);
		addButton("<",panel);
		addButton(">",panel);
		addButton(">>",panel);
		addButton("End",panel);
		add(panel,"North");
		
		cards = new Cards();
		add(cards,"Center");
		
		setVisible(true);
	}
	void addButton(String str,Container target) {
		JButton button=new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	private class Cards extends JPanel{
		CardLayout layout;
		public Cards() {
			layout=new CardLayout();
			setLayout(layout);
			for(int i=1;i<=10;i++) {
				add(new JButton("Current card number is "+i+"."),"Center");
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("End"))
			System.exit(0);
		else if(e.getActionCommand().equals("<<")) {
			cards.layout.first(cards);
		}
		else if(e.getActionCommand().equals("<")) {
			cards.layout.previous(cards);
		}
		else if(e.getActionCommand().equals(">")) {
			cards.layout.next(cards);
		}
		else if(e.getActionCommand().equals(">>")) {
			cards.layout.last(cards);
		}
	}
}
public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
