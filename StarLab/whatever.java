import java.util.*;
public class whatever {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    for (int x=1 ; x < a.length; ) {
      System.out.println("please enter a number: ");
      int waiting = sc.nextInt();
      boolean duplicate = false;
      for (int y=1 ; y <= a.length-1 ; y++) {
        
        if ( a[y] == waiting ) {
          duplicate = true ;
          System.out.println("please enter a number: ");
        }
      }
         if (!duplicate) {
          a[x]= waiting;
          ++x;
        }
    }
  }
}     
    
    