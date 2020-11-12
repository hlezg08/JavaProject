/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_assignment;

/**
 *
 * @author 성혜린
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ButtonExample {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame("JFrame program");
        frame.setPreferredSize(new Dimension(500,100));
        frame.setLocation(500,400);
        Container contentPane=frame.getContentPane();
        
        JPanel p1=new JPanel();
        JTextField text=new JTextField(30);
        p1.add(text);
        
        JPanel p2=new JPanel();      
        JButton b1=new JButton("1번 버튼");
        JButton b2=new JButton("2번 버튼");
        JButton b3=new JButton("3번 버튼");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        contentPane.add(p1,BorderLayout.CENTER);
        contentPane.add(p2,BorderLayout.SOUTH);
        
        ActionListener listener=new ConfirmButtonActionListener(text,p2);
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
