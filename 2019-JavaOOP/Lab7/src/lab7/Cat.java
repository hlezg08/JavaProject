/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

class Cat extends Feline{
    Cat(String name,int height,int weight,int distance,int callnum){
       super(name,height,weight,distance,callnum);
    }
    void callSound(int n){
        System.out.println("=================");
        for(int i=0;i<n;i++){
            System.out.println("meow");
        }
        System.out.println("=================");
    }
    void feeding(int amount){
        weight+=(amount*0.01);
    }
    void running(int distance) throws Exception{     
        if(weight<distance*0.1)
            throw new Exception("cat cant die from overworking!!");      
        weight-=(distance*0.1);
    }

}
