/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelindrome;

/**
 *
 * @author tahshin
 */
public class Pelindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int source[] = {3, 4, 5, 6, 7, 6, 5, 3, 1, 0, 0, 0};
        palindromCheck(source, 12, 2, 6);
    }

    public static void palindromCheck(int[] x, int y, int start, int end) {
        if (start < y && end < y) {
            if (start < x.length && end < x.length) {
                int temp = 0;
                int j = end;
                for (int i = start; i < j; i++) {
                    if (x[i] != x[j]) {
                        temp = 1;
                        break;
                    } else {
                        j--;
                    }
                }
                if (temp == 0) {
                    System.out.println("palindrome");
                } else {
                    System.out.println("not palindrome");
                }
            } else {
                System.out.println("Wrong Start or end index");
            }
        } else {
            System.out.println("Wrong Start or end index");
        }
    }
}
