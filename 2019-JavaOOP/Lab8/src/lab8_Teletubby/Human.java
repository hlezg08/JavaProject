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
abstract class Human extends Animal{
    Human(String name,String color,int height,int weight,int running_distance,int callnum){
        super(name,color,height,weight,running_distance,callnum);
    }
    void talk(int callnum){
        System.out.println("Hello~~");
    }
}
