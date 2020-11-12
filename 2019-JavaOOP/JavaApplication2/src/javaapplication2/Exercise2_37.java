/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 성혜린
 */
public class Exercise2_37 {
    public static void main(String[] args){
        int a=3,b=4,c=3,d=5;
        if((a==2|a==c)&!(c>d)&(1==b^c!=d))
            System.out.println("맞습니다. ^0^");
        else
            System.out.println("아닌데요. OTL");
    }
}
