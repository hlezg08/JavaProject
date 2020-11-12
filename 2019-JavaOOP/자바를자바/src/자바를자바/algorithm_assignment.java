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
class algorithm_assignment {
    int col[]=new int[15];
    int n;
    int result=0;
    public void main(String args[]){
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        queens(0);
        System.out.println(result);
    }
    boolean promising(int i){
        int j=1;
        boolean s=true;
        while(j<i){
            if(col[i]==col[j]||(col[i]-col[j])==(i-j)){
                s=false;
            }
            j++;
        }
        return s;
    }
    void queens(int i){
        int j;
        if(promising(i)){
            if(i==n)
                result+=1;
            else
                for(j=1;j<=n;j++){
                    col[i+1]=j;
                    queens(i+1);
                }
        }
    }
}
