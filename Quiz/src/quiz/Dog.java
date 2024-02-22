/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author 19101202
 */
public class Dog {
    String color ;

    public Dog(String color) {
        this.color = color;
    }
    public void bark() {
        System.out.println(color+"dog is barking");
    }
    public void changeColor(String x) {
        this.color = x;
    }
}
