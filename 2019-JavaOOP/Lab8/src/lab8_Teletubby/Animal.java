/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_Teletubby;

/**
 *
 * @author 성혜린
 */
abstract class Animal {
    String name,color;
    int height,weight,running_distance,callnum;
    Animal(String name,String color,int height,int weight,int running_distance,int callnum){
        this.name=name;
        this.color=color;
        this.height=height;
        this.weight=weight;
        this.running_distance=running_distance;
        this.callnum=callnum;
    }
    abstract void talk(int callnum);
    
    
}
