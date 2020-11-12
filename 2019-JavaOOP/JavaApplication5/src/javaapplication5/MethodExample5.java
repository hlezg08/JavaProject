/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author 성혜린
 */
public class MethodExample5 {
    public static void main(String args[]){
        Account1 obj=new Account1("777-777-77777777","최대박",10);
        try{
            int amount=obj.withdraw(100000000);
            System.out.println("인출액:"+amount);
        }
        catch(Exception e){
            String msg=e.getMessage();
            System.out.println(msg);
        }
    }
}
