/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.*;

/**
 *
 * @author tahshin
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        System.out.println("Factorial value is "+fact(num));
    }
    public static int fact(int n) {
        if ( n== 0 ) return 1;
        else return n*fact(n-1);
    }
    
}
