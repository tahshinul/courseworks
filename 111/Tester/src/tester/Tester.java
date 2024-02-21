/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;


/**
 *
 * @author tahshin
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobile m1 = new Mobile("redimi 8","9.10.2019",9440);
        Mobile m2 = new Mobile("redimi Note 8T","6.11.2019",16520);
        Mobile m3 = new Mobile("Mi A3",13977);
        
        m1.printDetails();
        m2.printDetails();
        m3.printDetails();
        
        System.out.println(m1.releasedEarlierThan(m2));
        System.out.println(m1.releasedEarlierThan(m3));
        
        System.out.println(m2.cheaperThan(m1));
        System.out.println(m1.cheaperThan(m3));
        
        System.out.println("The cheapest phone out of the "+Mobile.numberOfMobiles+" is"+Mobile.phoneName+", Price: "+Mobile.phonePrice+".");
    }
    
}
