/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author tahshin
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int [] x = {10,20,30,40,50,50,50,60,60,60,80};
      
        System.out.println(index_of_the_second_largest(x));
    }
    public static void rightShift (int[] x,int y) {
        int [] temp = new int [y];
        int count = temp.length-1;
        for ( int i=x.length-1;i>=y;i--) {
            temp[count] = x[i];
            x[i]=x[i-y];
            count--;
        }
        
        for (int i=0;i<temp.length;i++){
            x[i]=temp[i];
        }
    }
    public static void print(int[] y) {
        for ( int i = 0; i< y.length ; i++) {
            System.out.println(y[i]);
        }
    }
    public static int index_of_the_second_largest(int [] x ) {
        int index = 0;
        int largest = x[0];
        int secondLargest = x[0];
        for ( int i = 1; i < x.length ; i++ ) {
            if ( x[i] > largest ) {
                largest = x[i];
            }
        }
        for ( int i = 1; i < x.length; i++) {
            if ( x[i] > secondLargest && x[i] < largest ) {
                secondLargest = x[i];
                index = i;
            }
        }
        return index;
    }
    
}
