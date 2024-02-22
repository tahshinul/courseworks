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
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());

        Student s2 = new Student("Matin");
        System.out.println(s2.getName());

        Student s3 = new Student("Saad");
        System.out.println(s3.getName());
        System.out.println(Student.numberOfStudents);
    }

}
