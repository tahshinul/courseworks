/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_to_binary;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Decimal_to_binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter a decimal value");
        Scanner sc = new Scanner ( System.in);
        int x = sc.nextInt();
        System.out.println("The binary no is : ");
        binary(x);
        System.out.println("");
    }
    public static void binary(int x) {
        if ( x == 0 ) ;
        else {
            int k =(x%2);
            x = x/2;
            binary(x);
            System.out.print(k);
        }
    }
    
}
