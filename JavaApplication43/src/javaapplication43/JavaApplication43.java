/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author tahshin
 */
import java.util.*;
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr1 = new int[x];
        int[] arr2 = new int [y];
        for(int i = 0;i <arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0;i <arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0; i <=arr2.length-1; i++) {
            for (int j = 0; j <=arr1.length-1; j++){
                if (arr1[j] <= arr2[i]) count++;
            }
            System.out.print(count+" ");
            count = 0;
        }
    }
    
}
