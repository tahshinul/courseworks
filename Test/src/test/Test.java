/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author 19101202
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 1);
        Student s2 = new Student("Tom", 2);
        Student s3 = new Student("Jack", 3);
        Student s4 = new Student("Jill", 4);
        Printer pr = new Printer();
        pr.printDetail(s1);
        pr.printDetail(s2);
        pr.printDetail(s3);
        pr.printDetail(s4);
    }

}
