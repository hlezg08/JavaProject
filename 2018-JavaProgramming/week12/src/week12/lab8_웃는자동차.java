package week12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CarFrame extends JFrame implements ActionListener{
	Color color=Color.RED;
	private JButton paintbutton;
	private JRadioButton red,yellow,green;
	public CarFrame() {
		setTitle("Smiling car");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MyPanel p1=new MyPanel();
		add(p1);
		
		JPanel p2=new JPanel();
		red=new JRadioButton("RED");
		yellow=new JRadioButton("YELLOW");
		green=new JRadioButton("GREEN");
		/*ButtonGroup bg=new ButtonGroup();	//주석부분:라디오버튼 그룹화해서 한번에 하나씩만 눌리도록 구현됨
		bg.add(red);
		bg.add(yellow);
		bg.add(green);*/
		
		paintbutton=new JButton("Paint");
		paintbutton.addActionListener(this);
		p2.add(red);
		p2.add(yellow);
		p2.add(green);
		p2.add(paintbutton);
		add(p2,BorderLayout.PAGE_END);
		
		setVisible(true);
	}
	class MyPanel extends JPanel{
		int x=100,y=100;
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillRect(x+70,y,140,60);
			g.fillRect(x,y+60,280,100);
			g.setColor(Color.lightGray);
			g.fillOval(x+20,y+110,100,100);
			g.fillOval(x+160,y+110,100,100);
			g.setColor(Color.black);
			g.drawArc(x+160,y+20,45,60,0,180);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==paintbutton) {
			if(red.isSelected()) {
				color=Color.RED;
				repaint();
			}
			else if(yellow.isSelected()) {
				color=Color.YELLOW;
				repaint();
			}
			else if(green.isSelected()) {
				color=Color.GREEN;
				repaint();
			}
		}
	}
	
}
public class lab8_웃는자동차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CarFrame();
	}

}
