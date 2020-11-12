/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 성혜린
 */
public class Score_switch {
    public static void main(String args[]){
        int intMenu=0;
        boolean boolFlag=true;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("====================");
            System.out.println("1.성적입력");
            System.out.println("2.성적표출력");
            System.out.println("3.종료");
            System.out.println("====================");
            System.out.print("메뉴의 번호를 선택하세요(1~3):\t");
            try{
                intMenu=Integer.parseInt(input.next());
            }
            catch(Exception e){
                System.out.println("1~3까지의 숫자를 입력해주세요");
                continue;
            }
            switch(intMenu){
                case 1:
                    System.out.println("\n[성적정보 입력]");
                    break;
                case 2:
                    System.out.println("\n[성적표 출력]");
                    break;
                case 3:
                    System.out.println("\n[종료]");
                    boolFlag=false;
                    break;
                default:
                    System.out.println("1~3까지의 숫자를 입력해주세요.");
                    break;   
            } 
        }while(boolFlag);
    }
}
