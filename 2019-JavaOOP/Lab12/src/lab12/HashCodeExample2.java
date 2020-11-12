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
public class HashCodeExample2 {
    public static void main(String args[]){
        Name obj1=new Name("헤르미온느","그레인저");
        Name obj2=new Name("헤르미온느","그레인저");
        int hash1=obj1.hashCode();
        int hash2=obj2.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);
    }
}
