/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author 성혜린
 */
import java.util.*;
public class LinkedListExample3 {
    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();
        list.add("망고");
        list.add("pineapple");
        list.add("banana");
        Iterator<String> i=list.iterator();
        /*while(i.hasNext()){
            String str=i.next();
            System.out.println(str);
        }*/
        for(String str:list){
            System.out.println(str);
        }
    }
}
