/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final4;

/**
 *
 * @author tahshin
 */
public class Final4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
    public static int sum ( int x ) {
        if ( x ==0) return 0 ;
        else return x + sum ( x-1);
    }
    
}
