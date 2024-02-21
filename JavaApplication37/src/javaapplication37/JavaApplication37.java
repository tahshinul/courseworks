/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

import java.util.Scanner;

/**
 *
 * @author tahshin
 */
public class JavaApplication37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mystery(5);
    }

    public static int mystery(int n) {
        System.out.println("hello");
        if (n == 0) {
            System.out.println("value: 0");
            return 0;
        } else if (n == 1) {
            System.out.println("value: 1");
            return 1;
        } else {
            System.out.println("going down");
            int temp = mystery(n / 3) + mystery(n - 2) + 2;
            System.out.println("h(" + n + ") --> " + temp);
            return temp;
        }
    }
