/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author 성혜린
 */
class Wolf extends Dog{

    Wolf(String name, int size, int x) {
        super(name, size, x);
    }
    void bark(int numberofBark){ //메소드 오버라이딩
        for(int i=0;i<numberofBark;i++){
            System.out.println("ARH-W~~~~~~~~~~~~~");
        }
    }
    
}
