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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node head = new Node(0, null, null);
        Node n5 = new Node(5, head, null);
        Node n4 = new Node(4, n5, null);
        Node n3 = new Node(3, n4, null);
        Node n2 = new Node(2, n3, null);
        Node n1 = new Node(1, n2, head);
        n2.prev = n1;
        n3.prev = n1;
        n4.prev = n1;
        n5.prev = n1;
        head.prev = n5;
        head.next = n1;
        showList(head);
        System.out.println("");
        insert( head , 6);
        showList(head);
        System.out.println("");
        insertAt(head, 9 , 5);
        showList(head);
        System.out.println("");
        remove (head,5);
        showList(head);
        System.out.println("");
        removeKey(head,2);
        showList(head);
    }

    public static void showList(Node x) {
        if (x.next == null) {
            System.out.println("Empty list");
        } else {
            for (Node n = x.next; n != x; n = n.next) {
                System.out.print(n.element+" ");
            }
        }
    }
    public static void insert (Node x, int y) {
        Node p = new Node (y,null,null);
        Node tmp = null;
        for (Node n = x.next; n != x; n = n.next) {
            tmp = n;
        }
        p.prev = tmp;
        tmp.next = p;
        p.next = x;
        
    }
    public static void insertAt( Node x, int y, int z) {
        Node p = new Node ( y , null , null);
        int k = 1;
        Node tmp = null;
        for (Node n = x.next; n != x; n = n.next) {
           k++;
           if ( k == z ) tmp = n; 
        }
        Node q = tmp.next;
        p.next = q;
        p.prev = tmp;
        tmp.next = p;
        q.prev = p;
    }
    public static void remove ( Node x , int y ) {
        int k = 0;
        Node tmp = null;
        for (Node n = x.next; n != x; n = n.next) {
           k++;
           if ( k == y ) {
               tmp = n;
           } 
        }
        Node p = tmp.prev;
        Node q = tmp.next;
        p.next = q;
        q.prev = p;
    }
    public static void removeKey(Node x,int y) {
        Node tmp = null;
        for (Node n = x.next; n != x; n = n.next) {
            if ( n.element == y ) tmp =n;
        }
        Node p = tmp.prev;
        Node q = tmp.next;
        p.next = q;
        q.prev = p;
    }
}
