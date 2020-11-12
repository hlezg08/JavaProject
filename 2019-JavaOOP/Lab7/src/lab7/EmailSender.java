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
class EmailSender extends MessageSender{
    String senderAddr;
    String emailBody;
    EmailSender(String title,String senderName,String senderAddr,String emailBody){
        super(title,senderName);
        this.senderAddr=senderAddr;
        this.emailBody=emailBody;
    }
    void sendMessage(String recipient){
        System.out.println("------------------------");
        System.out.println("제목:"+title);
        System.out.println("보내는 사람:"+senderName+" "+senderAddr);
        System.out.println("받는 사람:"+recipient);
        System.out.println("내용:"+emailBody);
    }
}
