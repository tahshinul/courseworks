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
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=10;
       int b=20;
       int sum=add(a,b);
    }
    
    public static int add(int x,int y){
        x=100;
        int z=x+y;
        return z;
    }
    
}
