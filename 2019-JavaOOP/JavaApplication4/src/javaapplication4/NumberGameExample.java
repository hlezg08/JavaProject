/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author 성혜린
 */
import java.util.Random;
public class NumberGameExample {
    public static void main(String args[]){
        int randNum=0;
        Random rand=new Random();
        randNum=rand.nextInt(100);
        System.out.println("컴퓨터에서 생성한 난수:"+randNum);
    }
}
