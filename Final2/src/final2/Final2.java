/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final2;

/**
 *
 * @author tahshin
 */
public class Final2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n4 = new Node (50,null);
        Node n3 = new Node (30,n4);
        Node n2 = new Node (20,n3);
        Node n1 = new Node (10,n2);
        Node head = n1;
        System.out.println(len(head));
    }
    public static int len(Node x) {
        if ( x.next == null ) return 0;
        else return 1+len(x.next);
    }
    
}
