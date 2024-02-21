/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author tahshin
 */
import java.util.*;
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] x = { "p", "c", "f", "h","w" , "d"};
        int x = computeShifts(String[]x);
    }
    Public Static int computeShifts ( String[]A ) {
        String [] B = new String [A.length];
        String temp = "";
        int count = 0;
        for ( int x = 0; x < A.length ; x++ ) {
            for (int y = 0 ; y < B.length; y++) {
                if(A[x].compareToIgnoreCase(B[y]) > 0) {
                    temp = B[y];
                    B[y] = A[x];
                    B[y]=temp;
                    count ++;
                }
            }
        }
        return count;
    }
}
