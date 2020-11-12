import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyFrame2 extends JFrame{
	public MyFrame2() {
		setTitle("Click Test");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		
		JLabel label=new JLabel("click");
		label.setLocation(100,100);
		label.setSize(100,60);
		
		label.addMouseListener(new MouseEventTest());
		
		add(label);
		
		setVisible(true);
	}
	private class MouseEventTest extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			JLabel la=(JLabel)e.getSource();
			int x=(int)(Math.random()*260+1);
			int y=(int)(Math.random()*269+1);
			
			la.setLocation(x,y);
		}
	}
}
public class lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 f=new MyFrame2();
	}

}
