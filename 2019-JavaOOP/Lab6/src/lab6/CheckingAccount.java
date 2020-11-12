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
class CheckingAccount extends Account{
    String cardNo;
    CheckingAccount(String accountNo,String ownerName,int balance,String cardNo){
        super(accountNo,ownerName,balance);
        this.cardNo=cardNo;
    }
    int pay(String cardNo,int amount) throws Exception{
        if(!cardNo.equals(this.cardNo)||(balance<amount))
            throw new Exception("지불이 불가능합니다");
        return withdraw(amount);
    }
}
