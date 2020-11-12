package week12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CatchFrame extends JFrame {
	int x,y;
	JButton b;
	public CatchFrame() {
		setTitle("Catch me if you can");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		JPanel p1=new JPanel();
		b=new JButton("click");
		b.addMouseListener(new MouseTest());
		p1.add(b);
		add(p1);
		setVisible(true);
		
	}
	
	public class MouseTest extends MouseAdapter{
		public void mouseEntered(MouseEvent e) { //Pressed아님..
			x=(int)(Math.random()*b.getWidth());//왜 500에서 b.getWidth를 뺐는지..?
			y=(int)(Math.random()*b.getHeight());
			b.setLocation(x,y);
			System.out.println("changed x="+x+"\ty="+y);//콘솔로 출력
		}
	} //JButton의 메소드 :setLocation,getWidth,getHeight(이미 구현되어있어서 쓰기만 하면됨)
}
public class lab9_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CatchFrame();
	}

}
