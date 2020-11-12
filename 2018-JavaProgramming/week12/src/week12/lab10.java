package week12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CatchFrame2 extends JFrame {
	int x,y,x2,y2;
	JButton b1,b2;//MouseTest Ŭ������ ���� ���� ���������� �������!
	public CatchFrame2() {
		setTitle("Catch me if you can");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		JPanel p1=new JPanel();
		b1=new JButton("click");
		b2=new JButton("click2");
		b1.addMouseListener(new MouseTest());
		b2.addMouseListener(new MouseTest());

		p1.add(b1);
		p1.add(b2);
		add(p1);
		setVisible(true);
		
	}
	
	public class MouseTest extends MouseAdapter{
		public void mouseEntered(MouseEvent e) { //Pressed�ƴ�..
			if(e.getSource()==b1) {
				x=(int)(Math.random()*b1.getWidth());//�� 500���� b.getWidth�� ������..?
				y=(int)(Math.random()*b1.getHeight());
				b1.setLocation(x,y);
				System.out.println("changed x="+x+"\ty="+y);//�ַܼ� ���
			}
			
			else if(e.getSource()==b2) {
				x2=(int)(Math.random()*(500-b2.getWidth()));//�� 500���� b.getWidth�� ������..?
				y2=(int)(Math.random()*(500-b2.getHeight()));
				b2.setLocation(x2,y2);
				System.out.println("changed x="+x2+"\ty="+y2);//�ַܼ� ���
			}
		}
	} //JButton�� �޼ҵ� :setLocation,getWidth,getHeight(�̹� �����Ǿ��־ ���⸸ �ϸ��)

}
public class lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CatchFrame2();
	}

}
