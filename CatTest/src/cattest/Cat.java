/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattest;

/**
 *
 * @author 19101202
 */
public class Cat {

    public String color = "white" ;
    public String action = "sitting"; 

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String color, String action) {
        this.color = color;
        this.action = action;
    }
    public void printCat(){
        System.out.println(color+" cat is "+action);
        
    }
    public void changeColor(String x) {
        this.color = x;
    }
}
