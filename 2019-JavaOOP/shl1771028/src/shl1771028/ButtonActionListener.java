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
import javax.swing.JTextField;
public class ButtonActionListener implements ActionListener{
    int intFlag=0;
    String strAct=null;
    JTextField display=null;
    String strOP=null;
    String strTmp=null;
    
    public ButtonActionListener(JTextField display){
        this.display=display;
    }
    public void actionPerformed(ActionEvent ae){
        strAct=ae.getActionCommand();
        if(strAct.equals("/")||strAct.equals("*")||strAct.equals("-")||strAct.equals("+")||strAct.equals("%")){
            strTmp=display.getText();
            strOP=strAct;
            intFlag=1;
        }
        else if(strAct.equals("sqrt")){
           strTmp=display.getText();
           double a=Double.parseDouble(strTmp);
           double temp=Math.sqrt(a);
           display.setText(""+temp);
           intFlag=3;
        }
        else if(strAct.equals("1/x")){
           strTmp=display.getText();
           double a=Double.parseDouble(strTmp);
           double temp=1/a;
           display.setText(""+temp);
           intFlag=3;
        }
        else if(strAct.equals("=")){
            if(intFlag==2){
                double a=Double.parseDouble(strTmp);
                double b=Double.parseDouble(display.getText());
                if(strOP.equals("+")){
                    display.setText(""+(a+b));
                }
                else if(strOP.equals("-")){
                    display.setText(""+(a-b));
                }   
                else if(strOP.equals("/")){
                    if(a==0||b==0)
                        display.setText("Error");
                    else
                        display.setText(""+(a/b));
                }
                else if(strOP.equals("*")){
                    display.setText(""+(a*b));
                }
                else if(strOP.equals("%")){
                    display.setText(""+(a%b));
                }
                intFlag=0;
                
            }
        }
        else if(strAct.equals("C")){
            intFlag=0;
            display.setText("0");
        }
        
        else{
            if(intFlag==1){
                intFlag=2;
                display.setText("0");
            }
            if(intFlag==3){
                display.setText("0");
                intFlag=0;
            }
            if(display.getText().equals("0"))
                display.setText(strAct);
            else
                display.setText(display.getText()+strAct);
            if(strAct.equals("END")){
                System.exit(0);
            }
            
        }
    }
}
