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
public class InheritanceExample3 {
    public static void main(String args[]){
        CreditLineAccount obj=new CreditLineAccount("000-11-111111","김선달",10000,200000000);
        try{
            int amount=obj.withdraw(50000);
            System.out.println("인출액:"+amount);
            System.out.println("잔액:"+obj.balance);
            System.out.println("마이너스 한도:"+obj.creditLine);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
    }
}
