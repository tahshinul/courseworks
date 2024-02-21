/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author tahsh
 */
public class Node {
    public int element;
    public Node next;
    public Node prev;
    public Node ( int a, Node b , Node c) {
        element = a;
        next = b;
        prev = c;
    }
}
