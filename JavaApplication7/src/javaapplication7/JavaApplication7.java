/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author tahshin
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] x = {4,5,6,6,4,3,6,4};
        boolean k = repeat(x);
        System.out.println(k);
    }
    public static boolean repeat ( int[] x) {
        int [] k = new int [x.length];
        boolean q = false ;
        int countx = 0;
        int count = 0;
        for ( int i = 0; i < x.length ; i ++ ) {
            for ( int j = 1 ; j< x.length ; j++) {
                if ( x[i] == x[j] ){
                    count ++;
                    x[j] = 0;
                }
                if ( j == x.length-1 ) {
                    k[countx] = count;
                    countx++;
                }
            }
        }
        for ( int p = 0; p <= countx; p++ ) {
           for ( int u = 1; u <= countx; u++) {
               if (k[p] == k[u]) {
                   q = true;
               }
               else {
                   q = false;
               }
           }
        }
        return q;
    }
}
