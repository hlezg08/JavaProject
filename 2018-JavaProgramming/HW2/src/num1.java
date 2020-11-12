import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	Font f1,f2,f3,f4;
	JTextField t1,t2,t3,t4;
	JButton button;
	JPanel p1;
	JLabel label;
	public MyFrame() {
		setTitle("������ ���� ������Ʈ �׸��� - ������");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1=new MyPanel();
		JPanel p2=new JPanel();
		f1=new Font("TimesRoman",Font.PLAIN,10);
		f2=new Font("TimesRoman",Font.PLAIN,10);
		f3=new Font("TimesRoman",Font.PLAIN,10);
		f4=new Font("TimesRoman",Font.PLAIN,10);
		
		JLabel l1=new JLabel("��");
		t1=new JTextField(5);
		JLabel l2=new JLabel("��");
		t2=new JTextField(5);
		JLabel l3=new JLabel("��");
		t3=new JTextField(5);
		JLabel l4=new JLabel("�� ��");
		t4=new JTextField(5);
		button=new JButton("Ȯ��");
		button.addActionListener(this);
		label=new JLabel();//���̺�,�ؽ�Ʈ�ʵ�,��ư ����
		
		p2.add(l1);
		p2.add(t1);
		
		p2.add(l2);
		p2.add(t2);
		
		p2.add(l3);
		p2.add(t3);
		
		p2.add(l4);
		p2.add(t4);
		p2.add(button); //���̺�,�ؽ�Ʈ�ʵ�,��ư���� �� �гο� �߰�
		
		add(p2,BorderLayout.PAGE_END); //�г��� �����ӿ� �ְ� ���̾ƿ��� ����
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		
		try {
			int n1=Integer.parseInt(t1.getText()); 
			int n2=Integer.parseInt(t2.getText());
			int n3=Integer.parseInt(t3.getText());
			int n4=Integer.parseInt(t4.getText());//�ؽ�Ʈ�ʵ忡 �־��� ���ڵ��� ��ȯ�ؼ� ���������� �����
			if(n1+n2+n3+n4 >100) {
				label.setText("��ü �л� ���� 100���Դϴ�.");
				add(label);
				remove(p1);
				setVisible(true);
				t1.setText("0");
				t2.setText("0");
				t3.setText("0");
				t4.setText("0"); //�л����� 100���� �Ѱ��� �� ���δ� 0���� ��ȯ
			}
			else if(n1+n2+n3+n4<=100){
				if(e.getSource()==button) {
					add(p1);
					remove(label);
					repaint();
					setVisible(true);	//�л����� 100���� �ѱ����ʾ����� ������Ʈ �׷��ֱ�
				}
			}
			else {
				throw new NumberFormatException(); //�׿� �ٸ� ���ڸ� �Է�������
			}
			
		}
		catch(NumberFormatException a) {
			label.setText("�л��� ���� �Է��ϼ���.");
			add(label);
			remove(p1);
			setVisible(true);
			t1.setText("0");
			t2.setText("0");
			t3.setText("0");
			t4.setText("0");//�׿� �ٸ� ���ڸ� �Է������� 0���� �� ��ȯ
		}
		
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.setFont(f1);
			g.drawString("������: ��", 400, 100);
			double arc1=Double.parseDouble(t1.getText());
			g.fillArc(100, 100, 200, 200, 0, (int)(arc1*3.6)); //�达 �� �׸� �׸���
			
			g.setColor(Color.yellow);
			g.setFont(f2);
			g.drawString("�����: ��", 400, 120);
			double arc2=Double.parseDouble(t2.getText());
			g.fillArc(100, 100, 200, 200, (int)(arc1*3.6), (int)(arc2*3.6)); //�̾� �� �׸� �׸���
			
			g.setColor(Color.blue);
			g.setFont(f3);
			g.drawString("�Ķ���: ��", 400, 140);
			double arc3=Double.parseDouble(t3.getText());
			g.fillArc(100, 100, 200, 200, (int)(arc1*3.6)+(int)(arc2*3.6), (int)(arc3*3.6));
			//�ھ� �� �׸� �׸���
			
			g.setColor(Color.green);
			g.setFont(f4);
			g.drawString("�ʷϻ�: �׿�", 400, 160);
			double arc4=Double.parseDouble(t4.getText());
			g.fillArc(100, 100, 200, 200, (int)(arc1*3.6)+(int)(arc2*3.6)+(int)(arc3*3.6), (int)(arc4*3.6));
			//�׿� �� �׸� �׸���
		}
	}
}

public class num1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
//��ǻ�Ͱ��� 1771028 ������
}
