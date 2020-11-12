/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 자바를자바;

import java.util.Scanner;

/**
 *
 * @author 성혜린
 */
class MyColorPoint extends MyPoint{
    String color;
    MyColorPoint(double x,double y,String color){
        super(x,y);
        this.color=color;
    }
    void move(double x,double y){
        this.x+=x;
        this.y+=y;
    }
    void reverse(){
        double temp=x;
        x=y;
        y=temp;
    }
    void show(){
            System.out.println("----reverse----");
            super.show();
            System.out.println(color);
       }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        MyColorPoint obj=new MyColorPoint(2,3,"blue");
        System.out.println("x축의 방향으로 이동 값:");
        double objx=s.nextDouble();
        System.out.println("y축의 방향으로 이동 값:");
        double objy=s.nextDouble();
        
        obj.move(objx,objy);
        obj.reverse();
        obj.show();
    }
}
