/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg420lab2;

/**
 *
 * @author tahsh
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("How many strings do you want to check");
        int n = sc.nextInt();
        String s[] = new String [n];
        System.out.println("Please enter your strings");
        s[0] = sc.nextLine();
        for ( int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        int k = 0;
        for ( int i = 0; i < s.length; i++) {
            k++;
            String x = check(s[i]);
            System.out.println(x+", "+k);
        }
    }
    public static String check(String x) {
        char at = '@';
        String what = null;
        for (int i = 0; i < x.length(); i++) {
            if ( i == 0 ) {
                boolean k =firstcheck(x.charAt(i));
                if ( k == false ) {
                    what = "invalid";
                    break;
                }
            }
            else if ( x.charAt(i) == at) {
                boolean w = beforeat(x,i);
                boolean z = afterat(x,i);
                if ( w == true && z == true ) {
                    what = "email";
                }
                else what = " invalid";
            }
            
        }
        return what;
    }
    public static boolean firstcheck(char x) {
        int k = 97;
        int l = 65;
        boolean a = false;
        while (l < 90 || k < 122) {
            char q = (char) l;
            char w = (char) k;
            if (x == q) {
                a= true;
            }
            if (x == w) {
                a = true;
            }
            k++;
            l++;
        }
        return a;
    }
    public static boolean beforeat(String a, int b) {
        int k = 97;
        int l = 65;
        int m = 48;
        char dot = (char)46;
        boolean s = false;
        while ( k < 122 || l < 90 || m < 57 ) {
            char q = (char) l;
            char w = (char) k;
            char z = (char) m;
            for (int i = 0; i < b; i++) {
                if ( a.charAt(i) == q) s = true;
                if ( a.charAt(i) == w) s = true;
                if ( a.charAt(i) == z) s = true;
                if ( a.charAt(i) == dot) s = true;
            }
            k++;
            l++;
            m++;
        }
        return s;
    }
    public static boolean afterat(String a, int b) {
        int k = 97;
        int l = 65;
        int m = 48;
        char dot = (char) 46;
        int c = a.length() - 1;
        boolean s = false;
        if (a.charAt(c) == dot) {
            s = false;
        }
        while (k < 122 || l < 90 || m < 57) {
            char q = (char) l;
            char w = (char) k;
            char z = (char) m;
            for (int i = b + 1; i < c-1; i++) {
                if (a.charAt(i) == q) {
                    s = true;
                } else if (a.charAt(i) == w) {
                    s = true;
                } else if (a.charAt(i) == z) {
                    s = true;
                }
            }
            k++;
            l++;
            m++;
        }
        return s;
    }
}
    

