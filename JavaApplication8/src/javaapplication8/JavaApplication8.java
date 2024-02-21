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
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node head = null;
        Node n9 = new Node (11,null);
        Node n8 = new Node (10,n9);
        Node n7 = new Node (9,n8);
        Node n6 = new Node (8,n7);
        Node n5 = new Node (6,n6);
        Node n4 = new Node (5,n5);
        Node n3 = new Node (4,n4);
        Node n2 = new Node (2,n3);
        Node n1 = new Node (1,n2);
        head = n1;
        Node head1 = null;
        Node p9 = new Node (9,null);
        Node p8 = new Node (8,p9);
        Node p7 = new Node (7,p8);
        Node p6 = new Node (6,p7);
        Node p5 = new Node (5,p6);
        Node p4 = new Node (4,p5);
        Node p3 = new Node (3,p4);
        Node p2 = new Node (2,p3);
        Node p1 = new Node (1,p2);
        head1 = p1;
        p1.merge(n1, p1);
        int count = 0;
        for ( Node l = p1; l!= null; l=l.next) {
            count++;
        }
        System.out.println(count);
    }
    
}
