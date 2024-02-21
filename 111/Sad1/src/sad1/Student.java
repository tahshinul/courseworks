
package sad1;

import java.util.Objects;

public class Student {
    private String name;
    private int id ;
    private String department = "undecided";
    
    public Student(){
        
    }
    public Student(String name, int credit, String dept){
        this.name = name;
        this.id = credit;
        this.department = dept;
    } 
    public Student(String name){
        this.name = name;
    }
    public void changeProgram(String dept){
        if ( dept.equals("CS") == true ) System.out.println(name + " has to complete 124 credits");
        if ( dept.equals("CSE") == true ) System.out.println(name + " has to complete 136 credits");
    }

    public void setID(int id) {
        this.id = id;
    }
    public void printDetails() {
        System.out.println("Name :"+name +"\nID : "+ id+"\nProgramme : "+department);
    }
}
