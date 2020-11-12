/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author 성혜린
 */
class Name {
    String firstName;
    String lastName;
    Name(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public boolean equals(Object obj){
        if(obj instanceof Name){
            Name name=(Name)obj;
            return (firstName.equals(name.firstName)&&lastName.equals(name.lastName));
        }
        else return false;
    }
    /*public boolean equals(Object obj){//추가해야 null이 뜨지 않음
        if(!(obj instanceof Name))
            return false;
        Name name=(Name)obj;
        if(firstName.equals(name.firstName)&&lastName.equals(name.lastName))
            return true;
        else
            return false;
    }*/
    public int hashCode(){//오버라이드
        return firstName.hashCode()+lastName.hashCode();
    }
}
