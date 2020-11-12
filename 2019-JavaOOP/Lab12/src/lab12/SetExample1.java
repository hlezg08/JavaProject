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
class SetExample1 {
    public static void main(String args[]){
        HashSet<String> set =new HashSet<String>();
        set.add("자바");
        set.add("에스프레소");
        set.add("카푸치노");
        set.add("자바");
        System.out.println("저장된 데이터의 수:"+set.size());
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str);
        }
    }
}
