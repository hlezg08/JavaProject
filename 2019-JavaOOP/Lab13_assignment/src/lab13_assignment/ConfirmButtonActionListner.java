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
import javax.swing.*;        
import java.awt.event.*;        
class ConfirmButtonActionListener implements ActionListener{
   JTextField text;
   JPanel panel;
   ConfirmButtonActionListener(JTextField text,JPanel panel){
       this.text=text;
       this.panel=panel;
   }
   public void actionPerformed(ActionEvent e){
       String name=e.getActionCommand();
       text.setText(name+"이 클릭되었습니다.");
   }
}
