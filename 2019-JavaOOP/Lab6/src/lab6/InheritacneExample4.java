/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author 성혜린
 */
public class InheritacneExample4 {
    public static void main(String args[]){
        BonusPointAccount obj=new BonusPointAccount("333-33-3333333","김미영",0,0);
        obj.deposit(10000000);
        System.out.println("잔액:"+obj.balance);
        System.out.println("누적 포인트:"+obj.bonusPoint);
    }
}
