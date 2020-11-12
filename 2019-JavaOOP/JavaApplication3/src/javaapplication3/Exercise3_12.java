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
public class Exercise3_12 {
    public static void main(String args[]){
        char ch='P';
        switch(ch){
            case 'A':
            case 'a':
                System.out.println("사과");
                break;
            case 'P':
            case 'p':
                System.out.println("배");
                break;
            case 'G':
            case 'g':
                System.out.println("포도");
                break;
            default:
                System.out.println("?");
                break;
        }
    }
}
