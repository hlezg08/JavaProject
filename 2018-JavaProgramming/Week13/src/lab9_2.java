import javax.swing.*;

class myFrame2 extends JFrame implements Runnable{
	JLabel label;
	public myFrame2() {
		setSize(400,400);
		setTitle("진동하는 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setLayout(null); //위치 설정해주기 위해 디폴트 레이아웃 널로 바꿈
		
		label=new JLabel("진동레이블");
		label.setSize(80,30);
		label.setLocation(160,140);
		add(label);
		setVisible(true);
		
	}
	public void run() {
		while(true) {
			int x=(int)(Math.random()*10);
			int y=(int)(Math.random()*10);
			int dir=(int)(Math.random()*4);
			
			switch(dir) {
			case 0:
				label.setLocation(160,140-y);
				break;
			case 1:label.setLocation(160,140+y);break;
			case 2:label.setLocation(160-x,140);break;
			case 3:label.setLocation(160+x,140);break;
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
public class lab9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myFrame2 f=new myFrame2();
		Thread tb=new Thread(f);
		tb.start();
	}

}
