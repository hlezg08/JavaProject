/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author 성혜린
 */
public class Exercise5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer obj=new StringBuffer("Hey, Java");;
        obj.deleteCharAt(1);
        obj.deleteCharAt(1);
        obj.insert(1,'i');
        System.out.println(obj);
    }
    
}
