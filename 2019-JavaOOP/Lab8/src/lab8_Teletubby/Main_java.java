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
public class Main_java {
    public static void main(String[] args) {
        // TODO code application logic here
        Rechargeable arr[]=new Rechargeable[2];
        arr[0]=new Battery();
        arr[1]=new Teletubby("Teletubby Robot","white", 125,50,20,3);
        chargeAll(arr);
        
        bgm();
        Narrator obj=new Narrator("Narrator","none",180,78,3,1);
        obj.talk(obj.callnum);
        
        Teletubby obj1=new Teletubby("Boradori","purple",125,55,20,1);
        Teletubby obj2=new Teletubby("Tubi","green", 135,80,20,2);
        Teletubby obj3=new Teletubby("Nana","yellow", 130,65,20,3);
        Teletubby obj4=new Teletubby("Po","red", 128,50,20,2);
        
        printInfo(obj1);
        printInfo(obj2);
        printInfo(obj3);
        printInfo(obj4);
        bgm();
    }
    static void printInfo(Teletubby obj){
        System.out.println("========================");
        System.out.println("Narrator:"+obj.name+"~~~~~");
        System.out.println("Name:"+obj.name);
        System.out.println("Color:"+obj.color);
        System.out.println("Height:"+obj.height+"cm");
        System.out.println("Weight:"+obj.weight+"kg");
        obj.talk(obj.callnum);
        obj.movement("red bag");
        obj.movement("orange ball");
        System.out.println("Weight after running:"+obj.running()+"kg");
    }
    static void bgm(){
        System.out.println("BGM: Boradori~ Tubi~ NaNa~ Po~~~ Teletubby~ Teletubby mm mm mm");
    }
    static void chargeAll(Rechargeable arr[]){
        for(int cnt=0;cnt<arr.length;cnt++){
            arr[cnt].recharge();
        }
    }
}
