/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author 성혜린
 */
import java.awt.*;
import javax.swing.*;
public class WindowExample6 {
    public static void main(String[] args){
        JFrame frame=new JFrame("연락처 프로그램");
        frame.setLocation(500,400);
        frame.setPreferredSize(new Dimension(250,150));
        Container contentpane=frame.getContentPane();
        
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(3,2));
        JLabel name=new JLabel("이름");
        JLabel address=new JLabel("주소");
        JLabel phone=new JLabel("전화번호");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        panel.add(name);
        panel.add(t1);
        panel.add(address);
        panel.add(t2);
        panel.add(phone);
        panel.add(t3);
        contentpane.add(panel,BorderLayout.CENTER);
        
        contentpane.add(new JButton("입력"),BorderLayout.SOUTH); //Button 아니고 JButton인거 주의하기!
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
