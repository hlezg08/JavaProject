/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shl1771028;

/**
 *
 * @author 성혜린
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator implements WindowListener{
    JFrame mainFrame=null;
    JTextField display=null;
    Panel displayPane=null;
    ButtonPane buttonPane=null;
    GraphicsConfiguration strTitle;
    
    public Calculator(String strTitle){
    }
    public void init(){
        mainFrame=new JFrame(strTitle);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setBounds(10,10,300,250);
        mainFrame.setPreferredSize(new Dimension(800,950));
        mainFrame.addWindowListener(this);
        mainFrame.setLocation(500,400);
        display=new JTextField(20);
        display.setText("0");
        display.setEditable(false);
        displayPane=new Panel();
        displayPane.setBounds(0,30,200,40);
        displayPane.add(display);
        buttonPane=new ButtonPane(display);
        buttonPane.setBounds(0,70,200,180);
        mainFrame.add("North",displayPane);
        mainFrame.add("Center",buttonPane);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args){
        Calculator cal=new Calculator("자바 계산기");
        cal.init();
    }
    public void windowOpened(WindowEvent we){
        System.out.println("계산기 시작");
    }
    public void windowClosing(WindowEvent we){
        System.out.println("계산기 종료");
        mainFrame.setVisible(false);
        mainFrame.dispose();
        System.exit(0);
    }
    public void windowClosed(WindowEvent we){
        System.out.println("계산기 종료될 때");
    }
    public void windowIconified(WindowEvent we){
        System.out.println("계산기 최소화");
    }
    public void windowDeiconified(WindowEvent we){
        System.out.println("계산기 원래크기로");
    }
    public void windowActivated(WindowEvent we){
        System.out.println("계산기 활성화");
    }
    public void windowDeactivated(WindowEvent we){
        System.out.println("계산기 비활성화");
    }
}
