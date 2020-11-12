/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 성혜린
 */
public class Homework1 {
    public static void main(String args[]){
        int prevnum[][]={{1,2,3},{4,5,6},{7,8,9}};
        int afternum[][]=new int[3][3];
        
        System.out.println("원본배열");
        for(int i=0;i<prevnum.length;i++){
            for(int j=0;j<prevnum[i].length;j++){
                System.out.print(prevnum[i][j]+"\t");
                afternum[j][i]=prevnum[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("열과 행을 바꾼 예");
        for(int i=0;i<afternum.length;i++){
            for(int j=0;j<afternum[i].length;j++){
                System.out.print(afternum[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
