/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author 성혜린
 */
class PhysicalInfo {
    String name;
    int age;
    float height,weight;
    PhysicalInfo(String name,int age,float height,float weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    void update(int age){
        this.age=age;
    }
    void update(int age,float height){
        this.age=age;
        this.height=height;
    }
    void update(int age,float height,float weight){
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
}
