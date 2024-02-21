/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;

/**
 *
 * @author tahshin
 */
public class mango extends fruit {
    int unitPrince;
    int unit;

    public mango(int unitPrince, String color) {
        super(color);
        this.unitPrince = unitPrince;
    }
    public void totalPrice(int x){
        this.unit=x;
        System.out.println(unit*unitPrince);
    }
}
