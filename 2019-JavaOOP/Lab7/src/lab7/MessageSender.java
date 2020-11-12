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
abstract class MessageSender {
    String title;
    String senderName;
    MessageSender(String title,String senderName){
        this.title=title;
        this.senderName=senderName;
    }
    abstract void sendMessage(String recipient);
}
