import java.util.*;
public class Ajaira {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    for (int ajaira = 0 ; ajaira < a.length; ) {
      System.out.println("please enter a number: ");
      int waiting = sc.nextInt();
      boolean duplicate = false ;
      for ( int newAjaira = 0; newAjaira <= ajaira-1 ; newAjaira++ ) {
        if ( a[newAjaira] == waiting ) {
          duplicate = true;
          System.out.println("your number is duplicate please try again ");
        }
      }
      if (!duplicate) {
        a[ajaira] = waiting ;
        ajaira++;
      }
    }
    for ( int ajaira = 0 ; ajaira < a.length ; ajaira ++ ) {
      System.out.print(a[ajaira]+" ");
    }
  }
}