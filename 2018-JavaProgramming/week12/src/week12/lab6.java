package week12;
import java.awt.*;
import javax.swing.*;

class ImageFrame2 extends JFrame{
	private JPanel panel;
	public ImageFrame2() {
		setTitle("Image draw Test");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel=new MyPanel();
		add(panel);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		private ImageIcon icon=new ImageIcon("cat.jpg");
		private Image img=icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 200,200,400,400,80,80,350,350,this);
			
		}
	}
}
public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageFrame2();
	}

}
