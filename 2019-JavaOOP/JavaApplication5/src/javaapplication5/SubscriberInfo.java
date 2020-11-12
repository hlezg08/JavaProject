/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author 성혜린
 */
class SubscriberInfo{
    String name,id,password;
    String phoneNo,address;
    SubscriberInfo(){
        
    }
    SubscriberInfo(String name,String id,String password){
        this.name=name;
        this.id=id;
        this.password=password;
    }
    SubscriberInfo(String name,String id,String password,String phoneNo,String address){
        /*this.name=name;
        this.id=id;
        this.password=password;*/
        this(name,id,password);
        this.phoneNo=phoneNo;
        this.address=address;
    }
    void changePassword(String password){
        this.password=password;
    }
    void setPhoneNo(String phoneNo){
        this.phoneNo=phoneNo;
    }
    void setAddress(String address){
        this.address=address;
    }
}
