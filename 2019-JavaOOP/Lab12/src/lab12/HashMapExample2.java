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
class HashMapExample2 {
    public static void main(String args[]){
        HashMap<Name, Integer> hashtable=new HashMap<Name,Integer>();
        hashtable.put(new Name("해리","포터"),new Integer(95));
        hashtable.put(new Name("헤르미온느","그레인저"),new Integer(100));
        Integer num=hashtable.get(new Name("해리","포터"));
        System.out.println("해리 포터의 성적은?: "+num);
    }
    
}
