package problem.pkg7;

import java.util.*;

public class Problem7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rows are there : ");
        int r = sc.nextInt();
        System.out.println("how many columns are there : ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (j == 1 || j == r || i == r || i == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}
