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
public class ArrayListExample2 {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(new Integer(12));
        list.add(new Integer(59));
        list.add(new Integer(7));
        list.remove(1);
        list.set(0,new Integer(80));
        for(int cnt=0;cnt<list.size();cnt++){
            int n=list.get(cnt);
            System.out.println(n);
        }
    }
}
