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
public class mainPoint {
    public static void main(String args[]){
        ColorPoint p=new ColorPoint();
        Scanner s=new Scanner(System.in);
        System.out.println("좌표의 x값을 입력하세요:");
        double px=s.nextDouble();
        System.out.println("좌표의 y값을 입력하세요:");
        double py=s.nextDouble();
        p.set(px, py);
        System.out.println("점의 색깔을 입력하세요:");
        String c =s.next();
        p.setColor(c);
        
        p.showColorPoint();
    }
}
