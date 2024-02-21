/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacchi;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Fibonacchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");
        Scanner sc = new Scanner ( System.in);
        int n = sc.nextInt();
        System.out.println("the "+n+"th term of the fibonacchi series is "+fibo(n));
    }
    public static int fibo(int n ){
        if (n <=1)return n;
        else return fibo(n-1)+fibo(n-2);
    }
    
}
