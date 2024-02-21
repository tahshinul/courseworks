/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive_linked_print;

/**
 *
 * @author tahshin
 */
public class Recursive_linked_print {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node head = null;
        
        Node n4 = new Node (50,null);
        Node n3 = new Node (30,n4);
        Node n2 = new Node (20,n3);
        Node n1 = new Node (10,n2);
        
        head = n1;
        print(head);

    }
    public static void print ( Node x ){
        if ( x.next == null ) {
            System.out.println(x.element);
        }
        else {
            print (x.next);
            System.out.println(x.element);
        }
    }
    
}
