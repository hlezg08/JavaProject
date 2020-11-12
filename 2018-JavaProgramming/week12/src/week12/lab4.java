package week12;
import java.awt.*;
import javax.swing.*;

class FontFrame extends JFrame{
	Font f1,f2,f3,f4,f5;
	public FontFrame() {
		setTitle("Font Test");
		setSize(700,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		f1=new Font("Serif",Font.PLAIN,20);
		f2=new Font("San Serif",Font.BOLD,30);
		/*f3=new Font("Monospaced",Font.ITALIC,40);
		f4=new Font("Dialog",Font.BOLD|Font.ITALIC,20);
		f5=new Font("DialogInput",Font.BOLD,10);*/
		
		JPanel panel=new MyPanel();
		add(panel);
		setVisible(true);
	
	}
	class MyPanel extends JPanel{
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			g.setFont(f1);
			g.drawString("Serif 20 points PLAIN", 10, 50);
			g.setFont(f2);
			g.drawString("San Serif 30 points BOLD", 10, 100);
		}
	}
}
public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontFrame();
	}

}
