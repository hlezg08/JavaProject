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


class PackageExample5 {
    public static void main(String args[]){
        geometry.Circle obj1=new geometry.Circle(3);
        geometry.polygon.Rectangle obj2=new geometry.polygon.Rectangle(8,9);
        if(obj1.getArea()>obj2.getArea())
            System.out.println("원의 면적이 더 넓습니다.");
        else
            System.out.println("원의 면적은 직사각형의 면적보다 작거나 같습니다.");
    }
}
