package problem.pkg12;

import java.util.*;

public class Problem12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many lines are there : ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            int count = 1;
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
                count++;
            }
            for (int k = count; k <= x; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
