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
class Teletubby extends Animal implements Rechargeable{
    Teletubby(String name,String color,int height,int weight,int running_distance,int callnum){
        super(name,color,height,weight,running_distance,callnum);
    }
    String present[]=new String[5];
    
    void talk(int callnum){
        for(int i=0;i<callnum;i++){
            System.out.println(name+": Hello~~");
       }
    }
    void movement(String obj){ 
        present[0]="red bag";
        present[1]="black hat";
        present[2]="white hat";
        present[3]="orange ball";
        present[4]="scooter";
        
        if(name.equals("Boradori")&&obj.equals(present[0])){
            System.out.println("*******************");
            System.out.println(name+": Arms out to the side for T and then upwards, with bent elbows, for W");
            System.out.println(name+": I really like it!");
        }
        else if(name.equals("Tubi")&&(obj.equals(present[1])||obj.equals(present[2]))){
            System.out.println("*******************");
            System.out.println(name+": Excited wiggle dance");
            System.out.println(name+": I really like it!");
        }
        else if(name.equals("Nana")&&obj.equals(present[3])){
            System.out.println("*******************");
            System.out.println(name+": Light-footed twirl");
            System.out.println(name+": I really like it!");
        }
        else if(name.equals("Po")&&obj.equals(present[4])){
            System.out.println("*******************");
            System.out.println(name+": Star jump");
            System.out.println(name+": I really like it!");
        }
    }
    int running(){
        System.out.println(name+" is running");
        weight-=(double)running_distance*0.01;
        return weight;
    }
    public void recharge(){
        System.out.println(name+" is recharged by electrical energy");
    }
}    
