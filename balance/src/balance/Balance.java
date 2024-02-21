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
import java.util.*;
public class Balance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner ( System.in ) ;
        System.out.println("Please enter your values");
        String x = sc.next();
        boolean k = balanced(x);
        if ( k == true ) System.out.println("This expression is correct");
        else System.err.println("This expression is incorrect");
        boolean v = listBalanced (x);
        if ( v == true ) System.out.println("This expression is correct");
        else System.err.println("This expression is incorrect");
        
    }
    public static boolean balanced (String s) {
     char [] y = new char [s.length()];
     boolean b = false;
        for ( int i = 0; i < s.length(); i++) {
            y[i]= s.charAt(i);
        }
        arrayStack j = new arrayStack(y); 
        for ( int i = 0; i < y.length ; i++) {
            char q = y[i];
            if ( q == '[' || q == '(' || q == '{' ) {
                j.push(q);
            }
            else if ( q == ']') {
                if ( j.pop() == '[') b =  true;
            }
            else if ( q == ')') {
                if (j.pop()== '(') b = true;
            }
            else if (q == '}') {
                if (j.pop() == '{') b = true;
            }
        }
        return b;
    }
    public static boolean listBalanced (String s) {
        boolean b = false;
        char [] y = new char [s.length()];
        for ( int i = 0; i < s.length(); i++) {
            y[i]= s.charAt(i);
        }
        Node o = p(y);
        listStack e = new listStack();
        for ( Node n = o; n!= null; n = n.next) {
            int q = n.element;
            if ( q == '[' || q == '(' || q == '{' ) {
                e.push(q);
            }
            else if ( q == ']') {
                if ( e.pop() == '[') b =  true;
            }
            else if ( q == ')') {
                if (e.pop()== '(') b = true;
            }
            else if (q == '}') {
                if (e.pop() == '{') b = true;
            }
        }
        return b;
    }
    public static Node p ( char [] a ) {
        Node head = null;
        Node tail = null;
        for ( int i =0 ; i < a.length; i++ ) {
            Node nNode = new Node ( a[i], null);
            if ( head == null ) {
                head = nNode;
                tail = nNode;
            }
            else {
                tail.next = nNode;
                tail = nNode;
            }
        }
        return head;
    }
}
