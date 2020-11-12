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
public class InheritanceExample6 {
    public static void main(String args[]){
        EmailSender obj1=new EmailSender("생축","고객센터","admin@","10%할인쿠폰발행");
        SMSSender obj2=new SMSSender("생축","고객센터","02-0000-0000","10%할인쿠폰발행");
        obj1.sendMessage("hatman@ddfd");
        obj2.sendMessage("010-0000-0000");
    }
}
