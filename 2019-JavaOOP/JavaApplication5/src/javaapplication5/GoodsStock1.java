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
class GoodsStock1{
    String goodsCode;
    int stockNum;
    GoodsStock1(String code,int num){
        goodsCode=code;
        stockNum=num;
    }
    void addStock(int amount){
        stockNum+=amount;
    }
    int subtractStock(int amount){
        if (stockNum<amount)
            return 0;
        stockNum-=amount;
        return amount;
    }
}