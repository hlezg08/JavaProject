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
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
class AddActionListener implements ActionListener{
    JTable table;
    JTextField t1,t2,t3;
    AddActionListener(JTable table,JTextField t1,JTextField t2,JTextField t3){
        this.table=table;
        this.t1=t1;
        this.t2=t2;
        this.t3=t3;
    }
    public void actionPerformed(ActionEvent e){
        String arr[]=new String[3];
        arr[0]=t1.getText();
        arr[1]=t2.getText();
        arr[2]=t3.getText();
        
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        model.addRow(arr);
    }
}
