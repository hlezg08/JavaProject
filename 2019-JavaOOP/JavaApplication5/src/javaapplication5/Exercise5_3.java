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

public class Exercise5_3 {
    public static void main(String args[]){
        GoodsStock1 obj;
        obj=new GoodsStock1("52135",200);
        
        System.out.println("상품코드:"+obj.goodsCode);
        System.out.println("재고수량:"+obj.stockNum);
        obj.addStock(100);
        System.out.println("상품코드:"+obj.goodsCode);
        System.out.println("재고수량:"+obj.stockNum);
    }
}
