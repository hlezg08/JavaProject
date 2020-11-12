/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author 성혜린
 */
class Dog{
    String name;
    int size,x;
    Dog(String name,int size,int x){
        this.name=name;
        this.size=size;
        this.x=x;
    }
    void bark(int numberofBark){
        if(size>=60){
            for(int i=0;i<numberofBark;i++){
                System.out.println("Woof!");
            }
        }
        else if(size>=30){
            for(int i=0;i<numberofBark;i++){
                System.out.println("Ruff!");
            }
        }
        else{
            for(int i=0;i<numberofBark;i++){
                System.out.println("Yip!");
            }
        }           
    }
    int run(int distance){
       return distance;
    }
}
