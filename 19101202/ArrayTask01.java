import java.util.*;
public class ArrayTask01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] a = new int [3];
        for (int count = 0; count < a.length; ++count ) {
            System.out.println("please enter a number: ");
            a[count] = sc.nextInt();
        }
        for (int count = 0; count < a.length; ++count ) {
            sum += a[count];
        }
        System.out.print(sum+", ");
        for (int count = 0; count < a.length; ++count ) {
            System.out.print(a[count]+", ");
        }
    }
}