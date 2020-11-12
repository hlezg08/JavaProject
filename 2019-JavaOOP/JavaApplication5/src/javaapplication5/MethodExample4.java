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
class MethodExample4 {
    public static void main(String args[]){
        int arr[]=new int[0];
        Numbers obj=new Numbers(arr);
        try{
            int average=obj.getAverage();
            System.out.println("평균="+average);
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("평균을 계산하는 도중 에러가 발생했습니다.");
        }
    }
}
