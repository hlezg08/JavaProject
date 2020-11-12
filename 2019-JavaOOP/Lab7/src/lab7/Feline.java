/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author 성혜린
 */
abstract class Feline {
    String name;
    int height,weight,distance,callnum;
    Feline(String name,int height,int weight,int distance,int callnum){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.distance=distance;
        this.callnum=callnum;
    }
    abstract void callSound(int n);
    abstract void running(int distance) throws Exception;
}
