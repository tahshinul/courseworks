package binary.search;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {3,68,45,21,6,82,12,3615,42,55,99,4,1,5,61,651,65,16,516,1321};
        sort(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("what number you want to search ?");
        int x = sc.nextInt();
        int left = 0;
        int right = a.length-1;
        while (left<right) {
            int mid = (left+right)/2;
            if (a[mid]==x) {
                System.out.println(x+" is found in the array");
                break;
            }else if (a[right]==x) {
                System.out.println(x+" is found in the array");
                break;
            }else if (a[left]==x) {
                System.out.println(x+" is found in the array");
                break;
            }else if (x<a[mid]) {
                right = mid-1;
            }else if (x>a[mid]) {
                left=mid+1;
            }
        }
        if (left>=right) {
            System.err.println(x+" not found in arrray");
        }
    }
    public static void sort(int[] array) {
        for (int b=1;b<array.length;b++) {
            int check = array[b];
            int check2 = b-1;
            while ((check2>-1)&&(array[check2]>check) ){
                array[check2+1]=array[check2];
                check2--;
            }
            array[check2+1]=check;
        }
    }
}