/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author 성혜린
 */
public class Circle {
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    
}
