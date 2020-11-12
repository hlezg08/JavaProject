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
class Narrator extends Human{
    Narrator(String name,String color,int height,int weight,int running_distance,int callnum){
        super(name,color,height,weight,running_distance,callnum);
    }
    void talk(int callnum){
        for(int i=0;i<callnum;i++){
            System.out.println(name+": Hello~~Teletubby Friends~");
       }
    }
}
