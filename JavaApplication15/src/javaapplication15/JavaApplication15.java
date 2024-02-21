/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author tahshin
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] x = { 1,2,3,4,5,6 } ;
       MyList y = new MyList(x);
       MyList z = new MyList(y.head);
       y.showList();
       System.out.println("");
       System.out.println(y.isEmpty());
       y.insert(y.head, 6, 7, 5);
       y.showList();
       System.out.println("");
       y.evenfinder();
       System.out.println("");
       y.search(9);
       y.sum();
       y.reverse();
    }
}
    
