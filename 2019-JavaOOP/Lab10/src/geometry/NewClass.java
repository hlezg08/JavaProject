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
class NewClass {
    public static void main(String args[]){
        Circle obj=new Circle(5);
        System.out.println("반지름="+obj.radius);
        System.out.println("면적="+obj.getArea());
    }
}
