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
import java.util.Vector;
public class VectorEx {
    public static void main(String args[]){
        Vector<Integer> v=new Vector<Integer>();
        v.add(5);
        v.add(1,100);
        System.out.println("벡터 내의 요소 객체 수:"+v.size());
        System.out.println(v.capacity()); //기본 용량이 10인가?
        for(int i=0;i<v.size();i++){
            int n=v.elementAt(i);
            System.out.println(n);
        }
    }
}
