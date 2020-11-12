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
public class Exercise4_14 {
    public static void main(String args[]){
        int divisor[]={5,4,3,2,1,0};
        for(int cnt=0;cnt<7;cnt++){
            try{
                int share=100/divisor[cnt];
                System.out.println(share);
            }
            catch(java.lang.ArithmeticException e){
                System.out.println("잘못된 연산입니다");
            }
            catch(java.lang.ArrayIndexOutOfBoundsException e){
                System.out.println("잘못된 인덱스입니다");
            }
        }
        System.out.println("Done");
    }
}
