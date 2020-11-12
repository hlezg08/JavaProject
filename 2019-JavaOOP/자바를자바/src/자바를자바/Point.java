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
class Point {
    double x,y;
    void set(double x,double y){
        this.x=x;
        this.y=y;
    }
    void showPoint(){
        System.out.println("("+x+", "+y+")");
    }
}
