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
class Numbers {
    int num[];
    Numbers(int num[]){
        this.num=num;
    }
    int getTotal(){
        int total=0;
        for(int cnt=0;cnt<num.length;cnt++)
            total+=num[cnt];
        return total;
    }
    int getAverage(){
        int total;
        total=getTotal();
        int average=total/num.length;
        return average;
    }
}
