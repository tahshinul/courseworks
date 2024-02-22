import java.util.*;
public class ArrayTask02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [10];
        for (int count = 0; count < a.length; ++count ) {
            System.out.println("please  enter a number :" );
            a[count] = sc.nextInt();
        }
        System.out.println("please enter the index number: ");
        int index = sc.nextInt();
        System.out.print(a[index]);
    }
}
            
        