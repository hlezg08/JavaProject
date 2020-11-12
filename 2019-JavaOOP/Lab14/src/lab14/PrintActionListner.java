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

class PrintActionListener implements ActionListener{
    JTable table;
    PrintActionListener(JTable table){
        this.table=table;
    }
    public void actionPerformed(ActionEvent e){
        TableModel model=table.getModel();
        int rowNum=model.getRowCount();
        int colNum=model.getColumnCount();
        
        for(int col=0;col<colNum;col++){
            String colName=model.getColumnName(col);
            System.out.print(colName+"\t");
        }//column 이름들 출력
        System.out.println();
        for(int row=0;row<rowNum;row++){
            for(int col=0;col<colNum;col++){
                Object obj=model.getValueAt(row,col);
                System.out.print(obj+"\t");
            }
            System.out.println();
        } //테이블 모델 출력, 2차원 배열이므로 반복문 중첩
        System.out.println("------------------------------");
    }
}
