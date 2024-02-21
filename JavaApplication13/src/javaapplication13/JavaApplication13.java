/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author tahshin
 */
import java.util.*;

public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 3, 2, 1, 4, 0, 0, 0, 0};
        System.out.println("Please choose a number : \n 1. Left shift \n 2. Left rotate \n 3. Remove the element of an index \n 4. Remove all occurrences of a particular element \n 5. Split'em ");
        System.out.println(" 6. Print max bunch count \n 7. check if its a pelindrome");
        int k = sc.nextInt();
        if (k == 1) {
            System.out.println("left shift by how many index?");
            int l = sc.nextInt();
            leftShift(a, l);
            print(a);
        } else if (k == 2) {
            System.out.println("left rotate by how many index?");
            int l = sc.nextInt();
            leftRotate(a, l);
            print(a);
        } else if (k == 3) {
            System.out.println("element of which index do you want to remove ?");
            int l = sc.nextInt();
            remove(a, 8, l);
            print(a);
        } else if (k == 4) {
            System.out.println("which element do you want to remove ?");
            int l = sc.nextInt();
            removeAll(a, 8, l);
        } else if (k == 5) {
            System.out.println("Where do you want to split");
            int l = sc.nextInt();
            System.out.println(split(a, l));
        } else if (k == 6) {
            max(a);
        } else if (k == 7) {
            System.out.println("Please enter start index!");
            int l = sc.nextInt();
            System.out.println("Pleasse enter end index");
            int m = sc.nextInt();
            palindromCheck(a, 8, l, m);
        }
        else System.err.println("please choose a number between 1-7");
    }

    public static int[] leftShift(int[] x, int y) {
        for (int c = 1; c <= y; c++) {
            for (int i = 0; i < x.length - 1; i++) {
                x[i] = x[i + 1];
            }
            x[x.length - 1] = 0;
        }
        return x;
    }

    public static void print(int[] x) {
        for (int c = 0; c < x.length; c++) {
            System.out.print(x[c] + "  ");
        }
    }

    public static int[] leftRotate(int[] x, int y) {
        for (int i = 0; i < y; i++) {
            int temp = x[0];
            for (int j = 0; j < x.length - 1; j++) {
                x[j] = x[j + 1];
            }
            x[x.length - 1] = temp;
        }
        return x;
    }

    public static int[] remove(int[] x, int y, int z) {
        for (int i = z; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }
        x[y - 1] = 0;
        return x;
    }

    public static int[] removeAll(int[] x, int y, int z) {
        int temp = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == z) {
                temp = i;
                for (int j = i; j < y - 1; j++) {
                    x[j] = x[j + 1];
                }
                x[y - 1] = 0;
                i--;
            }
        }
        if (temp < 0) {
            System.err.println(z + " is not in the array ");
        } else {
            print(x);
        }
        return x;
    }

    public static boolean split(int[] x, int y) {
        int k = 0, l = 0;
        for (int i = 0; i < y; i++) {
            k += x[i];
        }
        for (int i = y; i < x.length; i++) {
            l += x[i];
        }
        if (k == l) {
            return true;
        } else {
            return false;
        }
    }
        public static void max(int[] x) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[j] == x[i]) {
                    count++;
                    max = count;
                } else {
                    count = 0;
                }
            }
        }
        System.out.println(max);
    }
    public static void palindromCheck(int[] x, int y, int start, int end) {
        if (start < y && end < y) {
            if (start < x.length && end < x.length) {
                int temp = 0;
                int j = end;
                for (int i = start; i < j; i++) {
                    if (x[i] != x[j]) {
                        temp = 1;
                        break;
                    } else {
                        j--;
                    }
                }
                if (temp == 0) {
                    System.out.println("palindrome");
                } else {
                    System.err.println("not palindrome");
                }
            } else {
                System.err.println("Wrong Start or end index");
            }
        } else {
            System.err.println("Wrong Start or end index");
        }
    }
}
