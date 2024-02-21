/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author TAHSHIN
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String one = "M W C A D B O E";
        String two = "D M W C A R O P";

        String[] arrayone = two.split(" ");
        String[] arraytwo = one.split(" ");

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
        System.out.println(m[a][b]);
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
            if (print[i].equals("M")) System.out.print("monkeys ");
            else if (print[i].equals("W")) System.out.print("wearing ");
            else if (print[i].equals("C")) System.out.print("coats ");
            else if (print[i].equals("A")) System.out.print("are ");
            else if (print[i].equals("D")) System.out.print("doctors ");
            else if (print[i].equals("B")) System.out.print("because ");
            else if (print[i].equals("O")) System.out.print("of ");
            else if (print[i].equals("E")) System.out.print("evolution ");
            else if (print[i].equals("R")) System.out.print("results ");
            else if (print[i].equals("P")) System.out.print("eruption ");
        }
    }

}
