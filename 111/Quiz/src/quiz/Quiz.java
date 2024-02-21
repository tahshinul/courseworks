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
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog odie = new Dog("Red");
        Dog goofy = new Dog("Blue");
        odie.bark();
        goofy.bark();
        odie.changeColor("Brown");
        odie.bark();
    }

}