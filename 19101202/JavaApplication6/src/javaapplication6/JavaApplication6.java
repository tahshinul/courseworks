/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author TAHSHIN
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String one = "C D E F G A B C";
        String two = "C E F D A B G A C";

        String[] arrayone = one.split(" ");
        String[] arraytwo = two.split(" ");

        int a = arrayone.length;
        int b = arraytwo.length;

        int m[][] = new int[a + 1][b + 1];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == 0 || j == 0) {
                    m[i][j] = 0;
                } else if (arrayone[i - 1].equals(arraytwo[j - 1])) {
                    m[i][j] = m[i - 1][j - 1] + 1;
                    //System.out.print(arrayone[i-1]);
                } else {
                    m[i][j] = Math.max(m[i - 1][j], m[i][j - 1]);
                }
            }
        }
        String[] print = new String[m[a][b]];
        int v = print.length - 1;
        int q = a;
        int w = b;
        while (q > 0 && w > 0) {
            if (arrayone[q - 1].equals(arraytwo[w - 1])) {
                print[v] = arrayone[q - 1];
                q--;
                w--;
                v--;
            } else if (m[q - 1][w] > m[q][w - 1]) {
                q--;
            } else {
                w--;
            }
        }

        for (int i = 0; i < print.length; i++) {
            System.out.print(print[i]);
        }

        System.out.println(" ");
        int avg = (m[a][b] * 100) / a;
        if (avg > 50) {
            System.out.println(avg + "% passed");
        } else {
            System.out.println(avg + "% failed");
        }
    }

}
