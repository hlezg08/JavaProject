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
public class HashCodeExample1 {
    public static void main(String args[]){
        String obj1=new String("헤르미온느");
        String obj2=new String("헤르미온느");
        int hash1=obj1.hashCode();
        int hash2=obj2.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
    }
}
