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
public class SillySender extends MessageSender{
    SillySender(String title,String senderName){
        super(title,senderName);
    }
     void sendMessage(String recipient){
        System.out.println("------------------------");
        System.out.println("제목:"+title);
        System.out.println("보내는 사람:"+senderName);
        System.out.println("받는 사람:"+recipient);
    }
}
