/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testteacher;

/**
 *
 * @author 19101202
 */
public class Teacher {
    String name ;
    String dept;
    Course [] x = new Course [5];
    int count=0;
    public Teacher(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public void addCourse(Course y) {
        x[count++] = y;
    }
    public void printDetail(){
        System.out.println("===================================");
        System.out.println("Name   :"+name);
        System.out.println("Deprtment  :"+dept);
        System.out.println("List of courses\n===================================");
        for(int i=0;i<count;i++) System.out.println(x[i].name);
        System.out.println("===================================");
    }
}
