/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 19101202
 */
public class JavaApplication2 {

    public static void printName(Student s) {
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        printName(new BBAStudent());
        printName(new BBAStudent("Humty Dumty"));
        printName(new BBAStudent("Little Bo Peep"));

    }

}
