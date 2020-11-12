/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 자바를자바;

import java.util.Scanner;

/**
 *
 * @author 성혜린
 */
public class ExceptionExample {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("나뉨수를 입력하시오.");
        int num=s.nextInt();
        System.out.println("나눗수를 입력하시오.");
        int div=s.nextInt();
        try{
            int n=num/div;
            System.out.println(n);
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
