/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive_m.n;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Recursive_mN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("please enter 2 values");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("the result of "+x+"^"+y+" is "+power(x,y));
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1; 
        } else {
            return x*power(x,(y-1));
        }
    }

}
