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
public class StaticInitializerExample2 {
    public static void main(String args[]) {
        for (int cnt = 0; cnt < 10; cnt++)
            System.out.println(ThreeArrays.arr3[cnt]);
    }

}
