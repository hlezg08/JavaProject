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
public class Exercise4_13 {
     public static void main(String args[]){
        int a=3,b=0;
        int result;
        try{
            result=a/b;
             System.out.println(result);
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("잘못된 연산입니다");
        }
       
        System.out.println("Done");
        
   }
}
