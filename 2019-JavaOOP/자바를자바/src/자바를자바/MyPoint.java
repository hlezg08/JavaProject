/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 자바를자바;

/**
 *
 * @author 성혜린
 */
abstract class MyPoint {
     double x;
       double y;
       public MyPoint(double x, double y) {
             this.x = x;
             this.y = y;
        }
       abstract void move (double x, double y);
       abstract void reverse();
       void show(){
             System.out.print("("+x+", "+y+") ");
       }
}
