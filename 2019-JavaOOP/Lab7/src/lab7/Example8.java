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
public class Example8 {
    public static void main(String args[]){
        EmailSender obj1 = new EmailSender("생일을 축하합니다", "고객센터",
             "admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
        SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터",
             "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");
        send(obj1,"hatman@yeyeye.com");
        send(obj2,"010-000-0000");
    }
    static void send(MessageSender obj,String recipient){
        obj.sendMessage(recipient);
    }
}
