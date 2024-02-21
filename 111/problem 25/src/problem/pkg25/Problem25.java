/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg25;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Problem25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many lines are there : ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }
        for (int i = x - 1; i >= 1; i--) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
