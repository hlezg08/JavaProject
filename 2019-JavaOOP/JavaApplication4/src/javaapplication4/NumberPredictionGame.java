/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.DataInputStream;

/**
 *
 * @author 성혜린
 */
import java.util.Scanner;
public class NumberPredictionGame {
    public static void main(String args[]){
        int inputNum=0;
        Scanner di=new Scanner(System.in);
        while(true){
            try{
                System.out.print("0에서부터 100까지의 숫자 하나를 입력하세요.");
                inputNum=Integer.parseInt(di.next());
                if(inputNum>=0&&inputNum<=100){
                    System.out.println("올바른 입력입니다.");
                    break;
                }
                System.out.println("잘못된 입력입니다.");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}