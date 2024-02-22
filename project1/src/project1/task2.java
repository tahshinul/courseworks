/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author rayhan.kabir
 */
public class task2 {
    public static void main(String[] args) {
        int [] x={10,6,9,13,7};
        System.out.println("please chose an option");
        System.out.println("1. Sort");
        System.out.println("2. Right shift ");
        System.out.println("3. left Shift");
         System.out.println("4. Right rotate ");
        System.out.println("5. left rotate");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) sort(x);
        else if(n==2) right_shift(x);
        else if(n==3) left_shift(x);
        else if(n==4) right_rotate(x);
        else if(n==5) left_rotate(x);
        else System.err.println("input error");
        
        
     
    }
    
     public static void left_rotate(int [] array){
    
         System.out.println("left rotate");
    }
      public static void right_rotate(int [] array){
    
    int temp= array[array.length-1];
       for(int i=array.length-1;i>0;i--){
         array[i]=array[i-1];   
        }
        array[0]=temp;
    }
    
    public static void sort(int [] array){
    
    
    }
    
    public static void right_shift(int [] array){
        
      
       for(int i=array.length-1;i>0;i--){
         array[i]=array[i-1];   
        }
        array[0]=0;
    
    }
    
    
    public static void left_shift(int [] array){
    
    
    }
}
