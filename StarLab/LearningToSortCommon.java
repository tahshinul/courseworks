import java.util.*;
public class LearningToSortCommon { 
    public static void main (String[] args) {
        int[] a = {77, 66, 88, 44, 99};
        int position=0;
        while(position < a.length-1) {
            int boroSoFar = a[position];
            int boroLocation = position;
            int v = position+1;
            while (v < a.length) {
                if (a[v] > boroSoFar) {
                    boroSoFar = a[v];
                    boroLocation = v;
                }
                ++v;
            }
            int icu = a[position];
            a[position] = boroSoFar;
            a[boroLocation] = icu;
            ++position;
        }
        int v = 0;
        while(v < a.length) {
            System.out.print(a[v]+" ");
            ++v;
        }
    }
}