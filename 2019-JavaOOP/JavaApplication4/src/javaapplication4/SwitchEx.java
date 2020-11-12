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
public class SwitchEx {
    public static void main(String args[]){
        int target=(int)(Math.random()*10);
        System.out.println("나눌대상:"+target);
        int odd=target%3;
        switch(odd){
            case 0:
                System.out.println("나머지는 0입니다");
                break;
            case 1:
                System.out.println("나머지는 1입니다");
                break;
            case 2:
                System.out.println("나머지는 2입니다");
                break;
        }
    }
}
