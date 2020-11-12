/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author 성혜린
 */
import geometry.polygon.*;
//import geometry.polygon.Rectangle;와 같음

class NewClass {
     public static void main(String args[]){
        Rectangle obj=new Rectangle(2,3);
        System.out.println("넓이="+obj.width);
        System.out.println("높이="+obj.height);
        System.out.println("면적="+obj.getArea());
    }
}
