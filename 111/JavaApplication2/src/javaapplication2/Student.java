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
public class Student {

    private String name = "Just a Student";
    private String department = "nothing";

    public void setDepartment(String dpt) {
        this.department = dpt;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name : " + name + " Department: " + department;
    }

}
