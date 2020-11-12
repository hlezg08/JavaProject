/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author 성혜린
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class WindowExample8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("참가자 명단 프로그램");
        frame.setLocation(500,400);
        frame.setPreferredSize(new Dimension(400,200));
        Container contentPane=frame.getContentPane();
        
        String colNames[]={"이름","나이","성별"};
        DefaultTableModel model=new DefaultTableModel(colNames,0);
        JTable table=new JTable(model);
        contentPane.add(new JScrollPane(table),BorderLayout.CENTER);
        
        JPanel panel=new JPanel();
        JTextField t1=new JTextField(6);
        JTextField t2=new JTextField(3);
        JTextField t3=new JTextField(2);
        JLabel l1=new JLabel("이름");
        JLabel l2=new JLabel("나이");
        JLabel l3=new JLabel("성별");
        JButton b1=new JButton("추가");
        JButton b2=new JButton("삭제");
        
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(t3);
        panel.add(b1);
        panel.add(b2);
        
        contentPane.add(panel,BorderLayout.SOUTH);
        
        b1.addActionListener(new AddActionListener(table,t1,t2,t3));
        b2.addActionListener(new RemoveActionListener(table));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
}
