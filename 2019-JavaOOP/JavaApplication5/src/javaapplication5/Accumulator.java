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
class Accumulator {
    int total=0;
    static int grandTotal=0;
    void accumulate(int amount){
        total+=amount;
        grandTotal+=amount;
    }
    static int getGrandTotal(){
        return grandTotal;
    }
}
