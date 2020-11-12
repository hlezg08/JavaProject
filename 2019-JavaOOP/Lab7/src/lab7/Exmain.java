/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class Exmain {
    public static void main(String args[]){
        Cat obj1=new Cat("Jack",25,3,20,3);
        Cat obj2=new Cat("Oscar",20,3,10,2);
        Cat obj3=new Cat("Molly",15,1,50,3);
        printCatInfo(obj1);
        obj1.feeding(100);
        printweight(obj1);
        
        printCatInfo(obj2);
        obj2.feeding(300);
        printweight(obj2);
        
        printCatInfo(obj3);
        obj3.feeding(300);
        printweight(obj3);
        
    }
    static void printCatInfo(Cat obj){
        System.out.println("*****************");
        System.out.println("name: "+obj.name);
        System.out.println("height: "+obj.height+"cm");
        System.out.println("weight: "+obj.weight+"kg");
        
        obj.callSound(obj.callnum);
    }
    static void printweight(Cat obj){
       System.out.println(obj.name+"'s Weight after eating food: "+obj.weight+"kg");
       System.out.println("Walking distance of the "+obj.name+": "+obj.distance+"meter");
       try{
           obj.running(obj.distance);
           System.out.println(obj.name+"'s Weight after walking: "+obj.weight+"kg");
       }
       catch(Exception e){
           String msg=e.getMessage();
           System.out.println(msg);
       }
    }
}
