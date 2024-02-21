/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg21;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Problem21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rows are there : ");
        int r = sc.nextInt();
        System.out.println("how many columns are there : ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == 1 || j == r || i == r || i == 1) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
