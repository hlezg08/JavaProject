package week12;
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	private MyPanel panel=new MyPanel();
	
	public MyFrame() {
		setTitle("MyFrame");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		int x=30, y=80;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Hello Everyone!", x, y);
			g.drawLine(x, y+10, x+100, y+10);
		}
	}
}
public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
