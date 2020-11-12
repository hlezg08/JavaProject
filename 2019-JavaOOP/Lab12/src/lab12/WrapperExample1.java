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
class WrapperExample1 {
    public static void main(String args[]){
        Integer obj1=new Integer(12);
        int s=obj1;//언박싱이 일어남 원래는 obj1.intValue()
        System.out.println(s);
        printDouble(1.3);//박싱이 일어남
    }
    static void printDouble(Double obj){
        System.out.println(obj);
    }
}
