/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracing;

/**
 *
 * @author tahshin
 */
public class A {

    public static int temp = 4;
    public int sum;
    public int y;

    public A() {
        y = temp - 2;
        sum = temp + 1;
        temp -= 2;
    }

    public void methodA(int m, int n) {
        int x = 0;
        y = y + m + (temp++);
        x = x + 1 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }
}
