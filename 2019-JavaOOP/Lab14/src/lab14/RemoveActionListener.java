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
class RemoveActionListener implements ActionListener{
    JTable table;
    RemoveActionListener(JTable table){
        this.table=table;
    }
    public void actionPerformed(ActionEvent e){
        int row=table.getSelectedRow(); //선택된 행
        if(row==-1)
            return;
        DefaultTableModel model=(DefaultTableModel) table.getModel();
        model.removeRow(row);
    }
}
