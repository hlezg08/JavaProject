package week12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ImageFrame3 extends JFrame implements ActionListener{
	ImageIcon icon;
	Image img;
	JPanel pathPanel;
	MyPanel imagePanel;
	JTextField text;
	JButton button;
	
	public ImageFrame3() {
		setTitle("Image Test");
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		imagePanel=new MyPanel();
		pathPanel=new JPanel();
		text=new JTextField(20);
		button=new JButton("Confirm");
		
		pathPanel.add(text);
		pathPanel.add(button);
		button.addActionListener(this);
		
		add(imagePanel,BorderLayout.CENTER);
		add(pathPanel,BorderLayout.SOUTH);
		setVisible(true);
		
	}
	class MyPanel extends JPanel{	//imagePanel
		void setPath(String path) {
			icon=new ImageIcon(path);
			img=icon.getImage();
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this);
		}
	}
	public void actionPerformed (ActionEvent e) {
		if(e.getSource()==button) {
			imagePanel.setPath(text.getText());
			imagePanel.repaint();
		}
	}
}
public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageFrame3();
	}

}
