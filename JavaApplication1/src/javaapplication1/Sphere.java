/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 19101202
 */
public class Sphere extends Point{

    public Sphere(double r) {
        super(r);
        System.out.println("Creating a Sphere … done!");
    }
    public double space(){
        return 4/3.0*3.1416*getRadius()*getRadius()*getRadius();
    }
}
