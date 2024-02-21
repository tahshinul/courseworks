/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive_linked_addition;

/**
 *
 * @author tahshin
 */
public class Node {

    int element;
    Node next;

    public Node(int x, Node y) {
        element = x;
        next = y;
    }
}
