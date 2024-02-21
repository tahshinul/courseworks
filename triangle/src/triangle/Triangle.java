/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter a number");
        int x = sc.nextInt();
        triangle(x);
    }
    public static void triangle(int x){
        for ( int k = 1 ; k <= x ; k++ ) {
            for ( int j = 1 ; j <= k ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
