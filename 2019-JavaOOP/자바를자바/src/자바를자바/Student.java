/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 자바를자바;

import java.util.Scanner;

/**
 *
 * @author 성혜린
 */
class Student extends Person{
    void set(int age,String name,int height,int weight){
        this.age=age;
        this.name=name;
        this.height=height;
        setWeight(weight);
    }
    void showStudent(){
        System.out.println(name+" 학생: 나이 ="+age+", 키= "+height+", 몸무게= "+getWeight());
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        Student obj = new Student();
        System.out.println("학생의 이름을 입력하세요:");
        String name=s.next();
        System.out.println("학생의 나이를 입력하세요:");
        int age=s.nextInt();
        System.out.println("학생의 키를 입력하세요:");
        int height=s.nextInt();
        System.out.println("학생의 몸무게를 입력하세요:");
        int weight=s.nextInt();
        
        obj.set(age, name, height, weight);
        obj.showStudent();
    }
}
