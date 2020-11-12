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
public class Exercise3_22 {
    public static void main(String args[]){
        int stnum[]={1,2,3};
        String stname[]=new String[3];
        double stscore[]=new double[3];
        
        stname[0]=new String("김이화");
        stname[1]=new String("공과대");
        stname[2]=new String("컴퓨터학과");
        
        stscore[0]=100.0;
        stscore[1]=95.5;
        stscore[2]=97.0;
        
        System.out.println("번호\t이름\t성적");
        for(int i=0;i<stnum.length;i++){
            String text=stnum[i]+"\t";
            text=text+stname[i]+"\t";
            text=text+stscore[i];
            System.out.println(text);
            //System.out.println(stnum[i]+"\t"+stname[i]+"\t"+stscore[i]);
        }
    }
}
