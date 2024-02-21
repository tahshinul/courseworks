/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string1;

/**
 *
 * @author tahshin
 */
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "Mid amr hogar bal";
        System.out.print(x.length());
        System.out.println(" ");
         for (int y=1; y<x.length(); y++) System.out.print(x.charAt(y)+"     ");
         char l = 'z';
         int c = (int)l;
         for (int y=1; y<x.length(); y++) {
             int p=x.charAt(y)+3;
             System.out.print(p);
         }
    }
    
}
