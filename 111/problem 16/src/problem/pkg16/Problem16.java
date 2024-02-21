/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.pkg16;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Problem16 {

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
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
    
}
