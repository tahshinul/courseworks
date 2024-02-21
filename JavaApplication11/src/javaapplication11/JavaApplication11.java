/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author tahshin
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = F(226705860);
        System.out.println(x);
    }

    public static int F(int n) {
        if (n < 10) {
            return n;
        }
        int m = 0;
        while (n > 0) {
            m += n % 10;
            n = n / 10;

        }
        return F(m);
    }
}
