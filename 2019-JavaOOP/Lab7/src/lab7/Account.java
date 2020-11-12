/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

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
    int withdraw(int amount) throws Exception{
        if(balance<amount)
            throw new Exception("잔액이 부족합니다.");
        balance-=amount;
        return amount;
    }
}
