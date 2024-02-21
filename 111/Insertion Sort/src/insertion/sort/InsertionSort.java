package insertion.sort;
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {3,68,45,21,6,82,12,36,42,55,99,4,1,5,61,651,65,16,516,1321,31312};
        for (int b=1;b<a.length;b++) {
            int check = a[b];
            int check2 = b-1;
            while ((check2>-1)&&(a[check2]>check) ){
                a[check2+1]=a[check2];
                check2--;
            }
            a[check2+1]=check;
        }
        for (int x=0;x<a.length;x++) System.out.print(a[x]+" ");
    }
}
 