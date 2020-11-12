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
public class StaticMethodExample1 {
    public static void main(String args[]){
        Accumulator obj1=new Accumulator();
        Accumulator obj2=new Accumulator();
        obj1.accumulate(10);
        obj2.accumulate(20);
        int grandTotal=Accumulator.getGrandTotal();
        System.out.println("obj1.total="+obj1.total);   
        System.out.println("obj2.total="+obj2.total);    
        System.out.println("총계="+grandTotal);
    }
}
