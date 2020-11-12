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
class SMSSender extends MessageSender{
    String returnPhoneNo;
    String message;
    SMSSender(String title,String senderName,String returnPhoneNo,String message){
        super(title,senderName);
        this.returnPhoneNo=returnPhoneNo;
        this.message=message;
    }
    void sendMessage(String recipient){
        System.out.println("------------------------");
        System.out.println("제목:"+title);
        System.out.println("보내는 사람:"+senderName);
        System.out.println("받는 사람:"+recipient);
        System.out.println("회선 전화번호:"+returnPhoneNo);
        System.out.println("내용:"+message);
    }
}
