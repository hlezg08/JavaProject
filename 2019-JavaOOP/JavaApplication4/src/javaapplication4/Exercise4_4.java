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
public class Exercise4_4 {
    public static void main(String[] args){
        for(int cnt=0;cnt<10;cnt++){
            if(cnt==5)
                continue;
            System.out.println(cnt);
        }
        System.out.println("Done");
    }
}
