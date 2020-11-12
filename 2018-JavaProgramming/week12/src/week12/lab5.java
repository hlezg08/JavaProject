package week12;
import javax.swing.*;

class ImageFrame extends JFrame{
	public ImageFrame() {
		setTitle("Image");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img=new ImageIcon("cat.jpg");
		JLabel label=new JLabel(img);
		
		add(label);
		pack();//¹¹¿´´õ¶ó????
		setVisible(true);
	}
}
public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageFrame();
	}

}
