/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author tahshin
 */
public class Node {
    Object element;
    Node next;
    public Node (Object x,Node y) {
        element = x;
        next = y;
    }
}
