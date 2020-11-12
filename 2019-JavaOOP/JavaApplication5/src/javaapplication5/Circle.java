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
class Circle{
    //double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double getArea(){
        double area;
        area=radius*radius*3.14;
        return area;
    }
    double radius;
}
