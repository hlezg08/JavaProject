/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 성혜린
 */
public class NumberPredictionGame1 {
    public static void main(String args[]){
        int randNum=0,inputNum=0,count=0;
        Random rand=new Random();
        randNum=rand.nextInt(100);
        
        Scanner s=new Scanner(System.in);
        
        while(true){
            System.out.print("0에서부터 100까지의 숫자 하나를 입력하세요.");
            try{                
                inputNum=Integer.parseInt(s.next());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(inputNum>=0&&inputNum<=100){
                count++;
                if(inputNum==randNum){
                    System.out.println(count+"번에 맞추셨습니다.");
                    break;
                }
                else if(inputNum<randNum){
                    System.out.println(inputNum+"은 난수보다 작습니다");
                }
                else{
                    System.out.println(inputNum+"은 난수보다 큽니다");
                }
            }
            else{
                System.out.println("잘못된 입력입니다");
            }
        }
    }
}
