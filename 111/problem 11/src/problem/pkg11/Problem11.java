package problem.pkg11;

import java.util.*;

public class Problem11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many lines are there : ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
        }
        for (int i = x - 1; i >= 1; i--) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
