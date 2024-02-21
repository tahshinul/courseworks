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
public class Vehicle2010 extends Vehicle{

    public Vehicle2010() {
    }
    
    public void upperRight(){
        super.moveUp();
        super.moveRight();
    }
    public void upperLeft(){
        super.moveUp();
        super.moveLeft();
    }
    public void lowerLeft(){
        super.moveDown();
        super.moveLeft();
    }
    public void lowerRight(){
        super.moveDown();
        super.moveRight();
    }
    public boolean equals (Vehicle2010 p){
        if (p.x==this.x&&p.y==this.y) return true;
        else return false;
        
    }
}
