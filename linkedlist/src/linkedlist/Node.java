/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

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
    public int countNode ( Node head ) {
        int count = 0;
        for ( Node n = head; n!=null; n=n.next) {
            count++;
        }
        return count;
    }
    public  Object get  ( Node head , int index ) {
        int c = 0;
        for ( Node n = head; n!=null; n=n.next ) {
            if ( c == index ) {
                return n.element;
            } 
            c++;
        }
        return 0;
    }
    public  void set  ( Node head , int index , Object x ) {
        int c = 0;
        for ( Node n = head; n!=null; n=n.next ) {
            if ( c == index ) {
                n.element=x;
            }
            c++;
        }
        
    }
    public  Node getNode  ( Node head ,int size, int index ) {
        if ( index < 0 ||  index >= size ) {
            return null;
        }
        else {
            int p = 0;
            Node q = head;
            for (Node n = head; n != null; n = n.next) {
                if (p == index) {
                    q = n.next;
                }
                p++;
            }
            return q;
        }
    }
    public  void printDuplicate( Node head ){
        for ( Node n = head; n!=null; n=n.next ) {
            for ( Node m = n.next; m!=null; m=m.next ) {
                if (n.element==m.element) {
                    System.out.println(n.element);
                } 
            }
        }
    }
     public int indexOf ( Node head , Object x){
         int i=0;
         for ( Node n = head ; n!=null; n=n.next ) {
             if ( n.element == x ) {
                 return i;
             }
             i++;
         }
         return -1;
     }
     public int lca ( Node head ) {
        int maxConsecutive = 1;
        for ( Node n = head; n!=null; n=n.next) {
            if ( n.element == n.next.element ) {
                maxConsecutive++;
            }
            else maxConsecutive =1;
        }
        return maxConsecutive;
     }
}

