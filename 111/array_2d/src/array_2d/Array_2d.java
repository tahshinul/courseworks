package array_2d;
import java.util.*;
public class Array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int [][] x = new int [10][10];
        for (int y =0; y<x.length; y++) {
            for (int z=0;z<x[y].length; z++) {
                System.err.println("please give an integer : ");
                x[y][z]= sc.nextInt();
            }
        }
        System.err.println("the 2d array is : ");
        for (int y=0;y<x.length; y++) {
            for (int z=0;z<x[y].length; z++) {
                System.out.print(x[y][z]+" ");
            }
            System.out.println();
        }
    }
}