package javaapplication1;

/**
 *
 * @author 19101202
 */
public class Point {
    private double radius;
    Point ( double r) {
        radius = r;
    }
    double space ( ) {
        System.out.println("Space for a Point can’t be defined");
        return 0;
    }
    protected double getRadius(){
        return radius;
    }
}

