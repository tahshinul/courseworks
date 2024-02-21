/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balance;

/**
 *
 * @author tahshin
 */
public class arrayStack implements Stack {

    int[] a;
    int size;

    public arrayStack(char [] x) {
        a = new int[x.length];
    }

    public void push(int e) {
        if (size == a.length) {
            System.err.println("Stack overflow!");
            return;
        }
        a[size] = e;
        size++;
    }

    public int peek() {
        if (size == a.length) {
            System.err.println("Stack overflow!");
            return 0;
        } else {
            int val = a[size - 1];
            return val;
        }
    }
    
    public int pop() {
        if (size == a.length) {
            System.err.println("Stack overflow!");
            return 0;
        }
        int val = a[size-1];
        a[size-1] = 0;
        size--;
        return val;
    }
}
