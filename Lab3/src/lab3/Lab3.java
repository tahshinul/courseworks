/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author tahsh
 */
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the number of regular expressions :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String reg[] = new String[n];
        System.out.println("Please enter the expressions :");
        reg[0] = sc.nextLine();
        for (int i = 0; i <= reg.length - 1; i++) {
            reg[i] = sc.nextLine();
        }
        System.out.println("Please enter the number of inputs to match :");
        int m = sc.nextInt();
        String in[] = new String[m];
        System.out.println("Please give inputs to match :");
        in[0] = sc.nextLine();
        for (int i = 0; i < in.length; i++) {
            in[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("OUTPUT :");
        Pattern r[] = new Pattern[n];
        for (int i = 0; i < r.length; i++) {
            r[i] = Pattern.compile(reg[i]);
        }
        Matcher mat[] = new Matcher[m];
        for (int i = 0; i < mat.length; i++) {
            boolean y = false;
            int u = 0;
            for (int j = 0; j < r.length; j++) {
                mat[i] = r[j].matcher(in[i]);
                if (mat[i].find()) {
                    y = true;
                    u = (j + 1);
                } 
            }
            if (y == true) {
                System.out.println("yes, " + u);
            }
            if (y == false) {
                System.out.println("No, " + 0);
            }
        }
    }
}
