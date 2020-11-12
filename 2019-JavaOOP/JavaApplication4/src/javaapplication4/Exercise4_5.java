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
public class Exercise4_5 {
    public static void main(String[] args){
        int cnt=0;
        while(cnt<10){
            if(cnt==5)
                continue;
            System.out.println(cnt);
            cnt++;
        }
        System.out.println("Done");
    }                                          
}
