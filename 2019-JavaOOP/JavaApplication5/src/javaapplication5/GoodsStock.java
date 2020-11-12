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
class GoodsStock{
    String goodsCode;
    int stockNum;
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
