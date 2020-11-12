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
class WindowExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame("Hello Java Program");
        frame.setLocation(500,400);
        frame.setPreferredSize(new Dimension(300,200));
        Container contentPane=frame.getContentPane();
        JLabel label=new JLabel("Hello Java",SwingConstants.CENTER);
        contentPane.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
