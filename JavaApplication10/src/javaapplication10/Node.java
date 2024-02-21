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
public class Node {

    Node next;
    int element;

    public Node(int x, Node y) {
        element = x;
        next = y;
    }

}
