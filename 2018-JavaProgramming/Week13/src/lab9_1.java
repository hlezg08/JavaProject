import java.awt.*;
import javax.swing.*;

class myFrame extends JFrame implements Runnable{
	public myFrame() {
		setSize(400,400);
		setTitle("진동하는 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setVisible(true);
	}
	public void run() {
		while(true) {
			int x=(int)(Math.random()*10);
			int y=(int)(Math.random()*10);
			int dir=(int)(Math.random()*4);
			
			switch(dir) {
			case 0:
				setLocation(100,100-y);
				break;
			case 1:setLocation(100,100+y);break;
			case 2:setLocation(100-x,100);break;
			case 3:setLocation(100+x,100);break;
			}
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class lab9_1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFrame r=new myFrame();
		Thread t=new Thread(r);
		t.start();
	}

}
