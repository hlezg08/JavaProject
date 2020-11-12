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

public class Lab6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Dog obj1=new Dog("Rudy",40,3);
        Dog obj2=new Dog("Bruno",10,5);
        Dog obj3=new Dog("Sam",50,10);
        Wolf obj4=new Wolf("wolf",100,2);
        
        printPhysicalInfo(obj1);
        obj1.bark(3);
        printDistance(obj1);
        
        printPhysicalInfo(obj2);
        obj2.bark(5);
        printDistance(obj2);
        
        printPhysicalInfo(obj3);
        obj3.bark(2);
        printDistance(obj3);
        
        printPhysicalInfo(obj4);
        obj4.bark(3);
        printDistance(obj4);
    }
    static void printPhysicalInfo(Dog obj){
        System.out.println("name: "+obj.name);
        System.out.println("size: "+obj.size);
    }
    static void printDistance(Dog obj){
       int distance=obj.x;
       System.out.println("Running Distance of the "+obj.name+": "+obj.run(distance));
    }
    
}
