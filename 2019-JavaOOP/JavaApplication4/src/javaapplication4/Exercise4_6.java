/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author 성혜린
 */
public class Exercise4_6 {
    public static void main(String[] args){
        loop:
            for(int row=0;row<3;row++){
                for(int col=0;col<5;col++){
                    if((row==1)&&(col==3))
                        continue loop;
                    System.out.println("("+row+","+col+")");
                }
            }
            System.out.println("Done");
    }
}
