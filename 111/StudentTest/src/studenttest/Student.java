/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttest;

/**
 *
 * @author 19101202
 */
public class Student {
    String name;
    static int numberOfStudents = 0;

    public Student() {
        name = "default name";
        numberOfStudents++;
    }

    public Student(String name) {
        this.name = name;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }
    
}
