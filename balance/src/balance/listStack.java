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
public class listStack implements Stack {
    Node head;
    public void push (int e) {
        Node n = new Node (e,head);
        head = n;
    }
    public int peek() {
        if ( head == null ) {
            System.err.println("Stack under flow");
            return 0;
        }
        else return head.element;
    }
    public int pop() {
        if ( head == null ) {
            System.err.println("Stack under flow");
            return 0;
        }
        Node remove = head;
        head = head.next;
        remove.next = null;
        return remove.element;
    }
}
