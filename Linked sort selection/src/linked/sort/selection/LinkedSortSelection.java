/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.sort.selection;

/**
 *
 * @author tahshin
 */
public class LinkedSortSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n5 = new Node(60, null);
        Node n4 = new Node(10, n5);
        Node n3 = new Node(90, n4);
        Node n2 = new Node(40, n3);
        Node n1 = new Node(70, n2);
        Node head = n1;
        ssort(head,n1);
    }
    public static void ssort(Node x,Node min){
        
    }
}
