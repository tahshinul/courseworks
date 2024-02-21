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
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = {3, 5, 1, 19, 2, -3, 5};

    }

    public Node build(int[]x){
    int l=x.length;
    if (l==0){
        return null;
}
    Node head=new Node(a[l-1],null,null);
    Node prev=head;
    for (int i=l-2;i>=0;--i){
        Node j= new Node(a[i],prev,null);
        prev.next=j;
        prev=j;
    }
    return head;
}
}
