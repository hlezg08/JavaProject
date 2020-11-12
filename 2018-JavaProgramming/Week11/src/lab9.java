import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Frame extends JFrame{
	public Frame() {
		setTitle("���콺 �ٷ� ��Ʈ ũ�� ����");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel label=new JLabel("Love Java");
		add(label);
		
		label.setFont(new Font("TimesRoman",Font.PLAIN,10));
		label.addMouseWheelListener(new mouseTest());
		
		setVisible(true);

	}
	private class mouseTest implements MouseWheelListener{
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n=e.getWheelRotation();
			if(n<0) {//���콺 ���� ���� ��������
				JLabel la=(JLabel)e.getSource();
				Font f=la.getFont();
				int size=f.getSize();
				la.setFont(new Font("TimesRoman",Font.PLAIN,size+5));
			}
			else{
				JLabel la=(JLabel)e.getSource();
				Font f=la.getFont();
				int size=f.getSize();
				la.setFont(new Font("TimesRoman",Font.PLAIN,size-5));
			}
		}
	}
}
public class lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
	}

}
