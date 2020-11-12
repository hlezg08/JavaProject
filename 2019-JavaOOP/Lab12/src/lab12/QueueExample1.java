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
public class QueueExample1 {
    public static void main(String args[]){
        LinkedList<String> queue=new LinkedList<String>();
        queue.offer("토끼");
        queue.offer("사슴");
        queue.offer("호랑이");
        while(!queue.isEmpty()){
            String str=queue.poll();
            System.out.println(str);
        }
    }
}
