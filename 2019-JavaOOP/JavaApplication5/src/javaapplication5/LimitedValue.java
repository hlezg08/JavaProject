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
class LimitedValue {
    final static int UPPER_LIMIT = 100000;
    int value;
    void setValue(int value) {
        if (value < UPPER_LIMIT)
            this.value = value;
        else
            this.value = UPPER_LIMIT;
    }

}
