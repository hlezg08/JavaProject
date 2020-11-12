/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 자바를자바;

import java.util.Scanner;

class Goods{
    String goodsname;
    int price,InventoryNum,soldNum;
}
public class GoodsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Goods obj1=new Goods();
        Goods obj2=new Goods();
        Goods obj3=new Goods();
        
        Scanner s=new Scanner(System.in);
        obj1.goodsname=s.next();
        String name1=obj1.goodsname;    
        obj1.price=s.nextInt();
        int price1=obj1.price;
        obj1.InventoryNum=s.nextInt();
        int inventory1=obj1.InventoryNum;
        obj1.soldNum=s.nextInt();
        int soldNum1=obj1.soldNum;
        
        obj2.goodsname=s.next();
        String name2=obj2.goodsname;    
        obj2.price=s.nextInt();
        int price2=obj2.price;
        obj2.InventoryNum=s.nextInt();
        int inventory2=obj2.InventoryNum;
        obj2.soldNum=s.nextInt();
        int soldNum2=obj2.soldNum;
        
        obj3.goodsname=s.next();
        String name3=obj3.goodsname;    
        obj3.price=s.nextInt();
        int price3=obj3.price;
        obj3.InventoryNum=s.nextInt();
        int inventory3=obj3.InventoryNum;
        obj3.soldNum=s.nextInt();
        int soldNum3=obj3.soldNum;
        
        System.out.println(name1+" "+price1+" "+inventory1+" "+soldNum1);
        System.out.println(name2+" "+price2+" "+inventory2+" "+soldNum2);
        System.out.println(name3+" "+price3+" "+inventory3+" "+soldNum3);
        
    }
    
}
