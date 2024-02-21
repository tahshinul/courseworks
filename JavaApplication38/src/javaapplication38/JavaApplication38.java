/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

/**
 *
 * @author tahshin
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = " kiBalerajairaCode";
        int u = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                u++;
            }
            if (u == 1) {
                int x = i + 1;
                for (int j = x; j < str.length(); j++) {
                    char ck = str.charAt(j);
                    if (Character.isUpperCase(ck)) {
                        u++;
                        break;
                    }
                    System.out.print(str.charAt(j));

                }
            } else if (u == 3) {
                break;
            }
        }
    }
}
