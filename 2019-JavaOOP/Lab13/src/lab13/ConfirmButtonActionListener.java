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
import javax.swing.*;        
import java.awt.event.*;        
class ConfirmButtonActionListener implements ActionListener{
   JTextField text;
   JLabel label;
   ConfirmButtonActionListener(JTextField text,JLabel label){
       this.text=text;
       this.label=label;
   }
   public void actionPerformed(ActionEvent e){
       String name=text.getText();
       label.setText("Hello, "+name);
   }
}
