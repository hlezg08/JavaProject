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
import javax.swing.*;
import java.awt.event.*;
public class ButtonPane extends Panel{
    Button[] butt=null;
    String[] buttName={"7","8","9","/","sqrt",
        "4","5","6","*","%",
        "1","2","3","-","1/x",
        "0","C","=","+","END"};
    public ButtonPane(JTextField display){
        setLayout(new GridLayout(4,5));
        ActionListener act1=new ButtonActionListener(display);
        butt=new Button[buttName.length];
        for(int i=0;i<butt.length;i++){
            butt[i]=new Button(buttName[i]);
            butt[i].setBackground(Color.white);
            if(i%5==3||i%5==4||i==16||i==17){
                butt[i].setBackground(Color.orange);
            }
            butt[i].addActionListener(act1);
            add(butt[i]);
        }
    }
  }

