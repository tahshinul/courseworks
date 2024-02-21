/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 19101202
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println(car.toString());
        car.moveUp();
        System.out.println(car.toString());
        car.moveLeft();
        System.out.println(car.toString());
        car.moveDown();
        System.out.println(car.toString());
        car.moveRight();
        System.out.println(car.toString());
        System.out.println(car);
    }
}