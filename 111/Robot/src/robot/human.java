package robot;
public class human {
    String name = "default name";
    String color= "blue";
    int version = 1;
    public void speak() {
        System.out.println("My name is : "+name);
    }
    human() {
        System.out.println("new human is created");
    }
}