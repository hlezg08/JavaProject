/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author 성혜린
 */
public class MethodExample2 {
   public static void main(String args[]){
       int arr[]={10,20,30,40,50,60,70,80,90,100};
       Numbers obj=new Numbers(arr);
       int total=obj.getTotal();
       int average=obj.getAverage();
       System.out.println("합계="+total);
       System.out.println("평균="+average);
   } 
   
}
