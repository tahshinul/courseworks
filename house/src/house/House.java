/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please mention the heigght of the house. ");
        int x = sc.nextInt();
        int y = hocBuilder(x);
        if (y == 0) System.out.println("You are not building a house so you need 0 cards. ");
        else System.out.println("You need "+y+" cards to build the house of cards");
    }
    public static int hocBuilder(int x){
        int k = 8 , l = 5;
        if ( x == 0 ) return 0;
        else if (x == 1) return k;
        else {
            return l+hocBuilder(x-1);
        }
    }
}
