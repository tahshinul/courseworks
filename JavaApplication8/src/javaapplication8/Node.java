/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author tahshin
 */
public class Node {

    Object element;
    Node next;
    
    public Node() {
     
    }
    public Node(Object x, Node y) {
        element = x;
        next = y;
    }
    public Node merge ( Node x, Node y ) {
        Node last;
        for ( Node n = x; n!=null; n=n.next) {
            last = n.next;
        }
        last= y;
        return x;
    }
}
