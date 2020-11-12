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

public class Exercise5_6 {
    public static void main(String args[]){
        Circle obj=new Circle(0.0);
        obj.radius=5.0;
        double area=obj.getArea();
        System.out.println(obj.radius);
        System.out.println(area);
    }
}
