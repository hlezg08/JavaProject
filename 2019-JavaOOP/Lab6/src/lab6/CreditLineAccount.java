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
class CreditLineAccount extends Account{
    int creditLine;
    CreditLineAccount(String accountNo,String ownerName,int balance,int creditLine){
        super(accountNo,ownerName,balance);
        this.creditLine=creditLine;
    }
    int withdraw(int amount) throws Exception{ //메소드 오버라이딩
        if(balance+creditLine<amount)
            throw new Exception("인출이 불가능합니다.");
        balance-=amount;
        return amount;
    }
}
