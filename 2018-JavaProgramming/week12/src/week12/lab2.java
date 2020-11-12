package week12;
import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	private MyPanel panel;
	
	public MyFrame2(){
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel=new MyPanel();
		add(panel);
		setVisible(true);

	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) { //±×·¡ÇÈ
			super.paintComponent(g);
			Color c=new Color(0,255,0);
			g.setColor(c);
			g.fillRect(10, 20, 300, 400);
		}
	}
}
public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}

}
