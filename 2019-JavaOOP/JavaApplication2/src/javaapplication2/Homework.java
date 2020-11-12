/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("성함을 입력해주세요:");
        String name=s.next();
        System.out.println("안녕하세요 "+name+"님!");
        System.out.println("이 프로그램은 계산기 프로그램 입니다");
        System.out.println("************************************");
        System.out.println("계산할 첫번째 숫자를 입력해주세요");
        int num1=s.nextInt();
        System.out.println("계산할 두번째 숫자를 입력해주세요");
        int num2=s.nextInt();
        System.out.println("************************************");
        int sum=num1+num2,minus=num1-num2,mul=num1*num2,div=num1/num2;
        int mod=num1%num2;
        System.out.println(num1+"+"+num2+"="+sum);
        System.out.println(num1+"-"+num2+"="+minus);
        System.out.println(num1+"*"+num2+"="+mul);
        System.out.println(num1+"/"+num2+"="+div);
        System.out.println(num1+"%"+num2+"="+mod);
    }
    
}
