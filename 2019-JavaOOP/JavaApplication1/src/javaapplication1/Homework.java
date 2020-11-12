/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args){
        String num="322 523 100";
        //String arr[]=num.split(" "); //내가 썼던 방법
        Scanner s=new Scanner(num); //솔루션
        int num1= Integer.parseInt(s.next());
        int num2= Integer.parseInt(s.next());
        //int num2= Integer.parseInt(arr[1]);
        int sum=num1+num2;
        System.out.println(sum);
        
    }
}
