/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 성혜린
 */
public class Exercise3_9 {
    public static void main(String args[]){
        int num=74;
        if(num<10)
            System.out.println("num의 값은 10 미만입니다.");
        else if(num<100)
            System.out.println("num의 값은 10 이상, 100 미만입니다.");
        else if(num<1000)
            System.out.println("num의 값은 100 이상, 1000 미만입니다.");
        else
            System.out.println("num의 값은 1000이상입니다.");
    }
}
