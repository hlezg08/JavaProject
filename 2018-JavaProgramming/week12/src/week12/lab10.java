package week12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CatchFrame2 extends JFrame {
	int x,y,x2,y2;
	JButton b1,b2;//MouseTest 클래스에 쓰기 위해 전역변수로 만든것임!
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
		public void mouseEntered(MouseEvent e) { //Pressed아님..
			if(e.getSource()==b1) {
				x=(int)(Math.random()*b1.getWidth());//왜 500에서 b.getWidth를 뺐는지..?
				y=(int)(Math.random()*b1.getHeight());
				b1.setLocation(x,y);
				System.out.println("changed x="+x+"\ty="+y);//콘솔로 출력
			}
			
			else if(e.getSource()==b2) {
				x2=(int)(Math.random()*(500-b2.getWidth()));//왜 500에서 b.getWidth를 뺐는지..?
				y2=(int)(Math.random()*(500-b2.getHeight()));
				b2.setLocation(x2,y2);
				System.out.println("changed x="+x2+"\ty="+y2);//콘솔로 출력
			}
		}
	} //JButton의 메소드 :setLocation,getWidth,getHeight(이미 구현되어있어서 쓰기만 하면됨)

}
public class lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CatchFrame2();
	}

}
