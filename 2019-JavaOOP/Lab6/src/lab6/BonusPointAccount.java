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
class BonusPointAccount extends Account{
    int bonusPoint;
    BonusPointAccount(String accountNo,String ownerName,int balance,int bonusPoint){
        super(accountNo,ownerName,balance);
        this.bonusPoint=bonusPoint;
    }
    void deposit(int amount){
        super.deposit(amount);
        bonusPoint+=(int)(amount*0.001);
    }
}
