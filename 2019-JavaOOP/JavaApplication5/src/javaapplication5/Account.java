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
class Account {
    String accountNo;
    String ownerName;
    int balance;
    Account(String accountNo,String ownerName,int balance){
        this.accountNo=accountNo;
        this.ownerName=ownerName;
        this.balance=balance;
    }
    void deposit(int amount){
        balance+=amount;
    }
    int withdraw(int amount){
        if(balance<amount)
            return 0;
        balance-=amount;
        return amount;
    }
}
