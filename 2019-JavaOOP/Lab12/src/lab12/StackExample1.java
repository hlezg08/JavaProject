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
public class StackExample1 {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> stack=new LinkedList<Integer>();
        stack.addLast(new Integer(12));
        stack.addLast(new Integer(59));
        stack.addLast(new Integer(7));
        while(!stack.isEmpty()){
            Integer num=stack.removeLast(); //list의 타입파라미터가 Integer이기 때문에 Integer사용?
            System.out.println(num);
        }
    }
    
}
