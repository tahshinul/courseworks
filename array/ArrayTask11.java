import java.util.*;
public class ArrayTask11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [10];
        System.out.println("please enter a number: ");
        a[0]= sc.nextInt();
        for (int count = 1; count < a.length; ++count ) {
            System.out.println("please  enter a number :" );
            int waiting = sc.nextInt();
            for (int xCount = 0; xCount <= count ; ++xCount) {
                if ( waiting == a[xCount] ) {
                        System.out.println("Please enter another number: ");
                        a[count] = sc.nextInt();
                }
                else {
                     a[count] = waiting;
                }
            }
        }
    }
}
                    
            /*if duplicate number was found then 
                ask input  again;
            else
                a count = waiting*/ 
                
            