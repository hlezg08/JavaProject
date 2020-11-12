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
public class WindowExample7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame("참가자 명단 프로그램");
        frame.setPreferredSize(new Dimension(300,150));
        frame.setLocation(500,400);
        Container contentPane=frame.getContentPane();
        
        String colNames[]={"이름","나이","성별"};
        Object data[][]={{"김철수",24,'남'},{"이순희",21,'여'},{"박지영",26,'여'}};
        JTable table=new JTable(data,colNames);
        JScrollPane scrollPane=new JScrollPane(table);
        contentPane.add(scrollPane,BorderLayout.CENTER);
        
        JButton button=new JButton("출력");
        button.addActionListener(new PrintActionListener(table));
        contentPane.add(button,BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
