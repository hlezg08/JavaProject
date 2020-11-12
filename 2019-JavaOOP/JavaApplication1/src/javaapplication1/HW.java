/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 성혜린
 */
import java.util.Scanner;
public class HW {
    public static void main(String args[]){
        String str="322 523 100";
        Scanner s=new Scanner(str);
        String str1=s.next();
        String str2=s.next();
        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        System.out.println(num1+num2);
    }
}
