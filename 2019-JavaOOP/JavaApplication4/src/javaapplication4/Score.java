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
import java.util.Scanner;
public class Score {
    public static void main(String args[]){
        int intMenu=0;
        
        Scanner input=new Scanner(System.in);
        loop:
            while(true){
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
                        break loop;      
                    default:
                        System.out.println("1~3까지의 숫자를 입력해주세요.");
                        break;
                }                    
            }                
    }
}
