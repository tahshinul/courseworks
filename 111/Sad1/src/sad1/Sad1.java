
package sad1;

public class Sad1 {

    public static void main(String[] args) {
 
        Student s1 = new Student("Grace Hopper", 111, "CSE");
        System.out.println("=========================");
        s1.changeProgram("CS");
        System.out.println("=========================");
        Student s2 = new Student("James Gosling");
        s2.setID(112);
        s2.printDetails();
        System.out.println("=========================");
        Student s3 = new Student("Steve Wozniak", 113, "CS");
        s3.changeProgram("CSE");
        System.out.println("-------------------------");
        s3.printDetails();
        System.out.println("=========================");
    }
}
        /**/