package week12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ColorFrame extends JFrame implements ActionListener{
	Color color=new Color(0,0,0);//초기 컬러 세팅
	
	public ColorFrame() {
		setTitle("Color Change Test");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JButton button=new JButton("Color change");
		button.addActionListener(this); //이 클래스 안에 implements ActionListener가 있기 때문에 this로 설정함
		p1.add(button);
		add(p1,"North");
		
		MyPanel p2=new MyPanel();//패널은 총 두개(버튼 하나,직사각형 하나)
		add(p2,"Center");
		
		setVisible(true);
	}
	class MyPanel extends JPanel{//직사각형 색칠하는 클래스
		public void paintComponent (Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillRect(10, 0, 260, 240);
		}
	}
	public void actionPerformed(ActionEvent e) {//버튼 누를시 수행하는 이벤트
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
