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
class ColorPoint extends Point{
    String color;
    void setColor(String color){
        this.color=color;
    }
    void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
