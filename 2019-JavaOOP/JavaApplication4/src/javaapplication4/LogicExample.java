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
public class LogicExample {
    public static void main(String args[]){
        int a=100,b=20,c=0;
        if(a<b&(c=a-b)>0){
            System.out.println("조건식은 참이다");
        }
        else{
            System.out.println("조건식은 거짓이다");
        }
        c=0;
        if(a>b|(c=a-b)>0){
            System.out.println("조건식은 참이다.");
            System.out.println("c="+c);
        }
        c=0;
        if(a>b||(c=a-b)>0){
            System.out.println("조건식은 참이다.");
            System.out.println("c="+c);
        }
        
    }
}
