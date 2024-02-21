package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Point p = new Point(0);
        System.out.println(p.space());
        System.out.println("enter radius of a circle");
        int y = x.nextInt();
        Circle c = new Circle(y);
        System.out.println("The area of the Circle is "+c.space());
        System.out.println("enter radius of a sphere");
        int z = x.nextInt();
        Sphere s = new Sphere(z);
        System.out.println("The volume of the Sphere is"+s.space());
    }

}
