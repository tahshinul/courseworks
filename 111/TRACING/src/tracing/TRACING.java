/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracing;

/**
 *
 * @author tahshin
 */
public class TRACING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(1, 2);
        b2.methodB(3, 2);
    }

}
