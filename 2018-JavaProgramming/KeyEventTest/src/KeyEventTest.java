import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("+,- 키로 폰트 크기 조절");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel label=new JLabel("Love Java");
		add(label);
		
		label.setFont(new Font("TimesRoman",Font.PLAIN,10));
		label.addKeyListener(new keyTest());
		
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();	
	}
	private class keyTest extends KeyAdapter{
		public void keyPressed (KeyEvent e) {
			if(e.getKeyChar()=='+') {
				JLabel la=(JLabel)e.getSource();
				Font f=la.getFont();
				int size=f.getSize();
				la.setFont(new Font("TimesRoman",Font.PLAIN,size+5));
			}
			else if(e.getKeyChar()=='-') {
				JLabel la=(JLabel)e.getSource();
				Font f=la.getFont();
				int size=f.getSize();
				la.setFont(new Font("TimesRoman",Font.PLAIN,size-5));
			}
		}
	}
}

public class KeyEventTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
