/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author tahshin
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        Node list = linkedList();
        System.out.println(factorial(4));
        System.out.println(fibonacci(5));
        print(a , 0);
        System.out.println(binary(6));
        System.out.println(power(7 , 8));
        System.out.println(add(list));
        reversed(list);
    }

    public static Node linkedList() {
        Node head = null;
        for (int i = 10; i > 0; i--) {
            head = new Node(i, head);
        }
        return head;
    }

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static int fibonacci(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void print(int[] a , int i) {
        if (i < a.length) {
            System.out.print(a[i]+" ");
            print(a , i + 1);
        }
    }

    public static String binary(int dec) {
        if (dec == 0) {
            return "";
        }
        return binary(dec / 2) + dec % 2;
    }

    public static int power(int x , int m) {
        if (m == 0) {
            return 1;
        }
        return x * power(x , m - 1);
    }

    public static int add(Node head) {
        if (head.next == null) {
            return head.element;
        }
        return head.element + add(head.next);
    }

    public static void reversed(Node head) {
        if (head != null) {
            reversed(head.next);
            System.out.print(head.element+ " ");
        }
    }
}


