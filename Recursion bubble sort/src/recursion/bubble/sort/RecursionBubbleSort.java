/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.bubble.sort;

/**
 *
 * @author tahshin
 */
public class RecursionBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] x = { 7,3,90,56,23,67,1,67,324,75,13};
        for ( int y = 0; y<x.length; y++) {
            System.out.print(x[y]+" ");
        }
        System.out.println("");
        bsort(x,10);
        for ( int y = 0; y<x.length; y++) {
            System.out.print(x[y]+" ");
        }
    }
    public static void bsort(int []x,int lin) {
        if ( lin == 0 ) return;
        for ( int y = 1; y<=lin; y++) {
            if ( x[y-1]> x[y]) {
                int temp = x[y-1];
                x[y-1] = x[y];
                x[y] = temp;
            }
        }
        for ( int y = 0; y<x.length; y++) {
            System.out.print(x[y]+" ");
        }
        System.out.println("");
        bsort(x,lin-1);
    }
    
}
