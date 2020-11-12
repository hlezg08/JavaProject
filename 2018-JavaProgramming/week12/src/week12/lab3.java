package week12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ColorFrame extends JFrame implements ActionListener{
	Color color=new Color(0,0,0);//�ʱ� �÷� ����
	
	public ColorFrame() {
		setTitle("Color Change Test");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JButton button=new JButton("Color change");
		button.addActionListener(this); //�� Ŭ���� �ȿ� implements ActionListener�� �ֱ� ������ this�� ������
		p1.add(button);
		add(p1,"North");
		
		MyPanel p2=new MyPanel();//�г��� �� �ΰ�(��ư �ϳ�,���簢�� �ϳ�)
		add(p2,"Center");
		
		setVisible(true);
	}
	class MyPanel extends JPanel{//���簢�� ��ĥ�ϴ� Ŭ����
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillRect(10, 0, 260, 240);
		}
	}
	public void actionPerformed(ActionEvent e) {//��ư ������ �����ϴ� �̺�Ʈ
		color =new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		repaint();
	}
}
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorFrame();
	}

}
