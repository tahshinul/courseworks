package assignment.pkg1;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        int[] x = {10, 6, 9, 13, 7};
        System.out.println("please chose an option");
        System.out.println("1. Sort");
        System.out.println("2. Right shift ");
        System.out.println("3. left Shift");
        System.out.println("4. Right rotate ");
        System.out.println("5. left rotate");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            sort(x);
        } else if (n == 2) {
            right_shift(x);
        } else if (n == 3) {
            left_shift(x);
        } else if (n == 4) {
            right_rotate(x);
        } else if (n == 5) {
            left_rotate(x);
        } else {
            System.err.println("input error");
        }

    }

    public static void left_rotate(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
        for (int g = 0; g < array.length; g++) {
            System.out.print(array[g] + " ");
        }
    }

    public static void right_rotate(int[] array) {

        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        for (int g = 0; g < array.length; g++) {
            System.out.print(array[g] + " ");
        }
    }

    public static void sort(int[] array) {
        for (int b = 1; b < array.length; b++) {
            int check = array[b];
            int check2 = b - 1;
            while ((check2 > -1) && (array[check2] > check)) {
                array[check2 + 1] = array[check2];
                check2--;
            }
            array[check2 + 1] = check;
        }
        for (int g = 0; g < array.length; g++) {
            System.out.print(array[g] + " ");
        }
    }

    public static void right_shift(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = 0;
        for (int g = 0; g < array.length; g++) {
            System.out.print(array[g] + " ");
        }
    }

    public static void left_shift(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        for (int g = 0; g < array.length; g++) {
            System.out.print(array[g] + " ");
        }
    }
}
