/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

/**
 *
 * @author tahshin
 */
import java.util.*;
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int r;
        int sum = 0;
        while ( n > 0 ) {
             r = n%10;
             sum = sum +r*r*r;
             n = n/10;
        }
        if ( a == sum ) System.out.println("Armstrong number");
        else System.out.println("It is not an Armstrong sumber");
    }
}
