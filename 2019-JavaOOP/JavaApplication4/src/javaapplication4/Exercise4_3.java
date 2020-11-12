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
public class Exercise4_3 {
    public static void main(String[] args){
        outerLoop:
            for(int row=0;row<3;row++){
                for(int col=0;col<5;col++){
                    System.out.println("("+row+","+col+")");
                    if((row==1)&&(col==3))
                        break outerLoop;
                  }
            }
        System.out.println("Done");
    }
}
