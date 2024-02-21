import java.util.*;
public class asdaldlasd {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    for ( int count = 0 ; count < a.length; ) {
      System.out.println("ples" );
      int waiting = sc.nextInt();
      boolean duplicate = false ;
      for (int newCount = 0 ; newCount <=count-1 ; newCount++) {
        if (waiting == a[newCount]) {
          duplicate = true ;
          System.out.println("duplicate >_<");
        }
      }
      if (!duplicate) {
        a[count]= waiting;
        count++;
      }
    }
    for (int count = 0 ; count < a.length; count++) {
      System.out.println(a[count]);
    }
  }
}