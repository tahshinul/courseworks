/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeliot.test;

/**
 *
 * @author tahshin
 */
public class JeliotTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mystery(4); 
    }

    public static int mystery(int n) {
        System.out.println("h(" + n + ")");
        if (n == 0) {
            System.out.println("value: 0");
            return 0;
        } else {
            System.out.println("going down");
            int temp = mystery(n - 1) + 1;
            System.out.println("h(" + n + ") --> " + temp);
            return temp;
        }
    }
}
