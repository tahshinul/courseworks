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
public class B {

    public static int x;
    public int y = 5;
    public int temp = -5;
    public int sum = 2;

    public B() {
        y = temp + 3;
        sum = 3 + temp + 2;
        temp -= 2;
    }

    public B(B b) {
        sum = b.sum;
        x = b.x;
        b.methodB(2, 3);
    }

    public void methodA(int m, int n) {
        int x = 2;
        y = y + m + (temp++);
        x = x + 5 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        x = this.y + 2 + temp;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y + " " + sum);
    }
}
