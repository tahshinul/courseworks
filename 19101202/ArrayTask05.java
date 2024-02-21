import java.util.*;
public class ArrayTask05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [10];
        for (int count = 0; count < a.length; ++count ) {
            System.out.println("please  enter a number :" );
            a[count] = sc.nextInt();
        }
        for (int count = 0; count < a.length; ++count ) {
            if ( a[count]%2==0) {
                System.out.print( a[count]);
                break;
            }
        }

    }
}