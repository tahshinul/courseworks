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
public class Vehicle {

    int x, y;

    public Vehicle() {
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
