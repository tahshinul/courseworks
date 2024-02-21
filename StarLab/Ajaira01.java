import java.util.*;
public class Ajaira01 {
  public static void main (String[] args) {
    int[] a = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int count = 0; count < a.length ; count++ ) {
      a[count]=sc.nextInt();
    }
    int position=0;
        while(position < a.length) {
            int boroSoFar = a[position];
            int boroLocation = position;
            int chotoSoFar = a[position];
            int chotoLocation = position;
            int v = position+1;
            while (v < a.length) {
                if (a[v] > boroSoFar) {
                    boroSoFar = a[v];
                    boroLocation = v;
                }
                ++v;
            }
            while (v < a.length) {
                if (a[v] < chotoSoFar) {
                    chotoSoFar = a[v];
                    chotoLocation = v;
                }
                ++v;
            }
         System.out.println(boroSoFar);
         System.out.println(chotoSoFar);
         break;
        }
  }
}