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
public class BBAStudent extends Student{

    public BBAStudent() {
        super.setName("Default name");
        super.setDepartment("BBA");
    }
    public BBAStudent(String x) {
        super.setName(x);
        super.setDepartment("BBA");
    }
    
}
