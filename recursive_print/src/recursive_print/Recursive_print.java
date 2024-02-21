/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive_print;

/**
 *
 * @author tahshin
 */
public class Recursive_print {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        printArray(a, 0);
    }

    public static void printArray(int[] a, int x) {
        if (x == a.length) {

        } else {
            System.out.println(a[x]);
            x++;
            printArray(a, x);
        }
    }

}
