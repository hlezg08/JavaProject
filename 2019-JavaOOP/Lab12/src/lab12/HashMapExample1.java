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
public class HashMapExample1 {
    public static void main(String args[]){
        HashMap<String,Integer> hashtable=new HashMap<String,Integer>();
        hashtable.put("해리", new Integer(95));
        hashtable.put("헤르미온느", new Integer(100));
        hashtable.put("론", new Integer(85));
        hashtable.put("드레이코", new Integer(93));
        hashtable.put("네빌", new Integer(70));
        Integer num=hashtable.get("헤르미온느");
        System.out.println("헤르미온느의 성적은?: "+num);
    }
}
