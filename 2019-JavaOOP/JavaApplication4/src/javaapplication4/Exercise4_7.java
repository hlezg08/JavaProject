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
public class Exercise4_7 {
    public static void main(String[] args){
        printCharacter('*',30);
        System.out.println("Hello Java");
        printCharacter('-',30);
    }
    static void printCharacter(char ch,int num){
        for(int cnt=0;cnt<num;cnt++)
            System.out.print(ch);
        System.out.println();
    }
}
