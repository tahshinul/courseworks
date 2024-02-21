/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class Final1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the string you want to find length of ");
        String x = sc.nextLine();
        System.out.println(Len(x));
        
    }
    public static int Len (String x ) {
        if (x.equals("")) return 0;
        else return 1+Len(x.substring(1));
    }
    
}
