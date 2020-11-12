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
public class Person {
    int age;
    public String name;
    protected int height;
    private int weight;
    void setWeight(int weight){
        this.weight=weight;
    }
    int getWeight(){
        return weight;
    }
}
