/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattest;

/**
 *
 * @author 19101202
 */
public class CatTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Black");
        Cat c3 = new Cat("Brown", "jumping");
        Cat c4 = new Cat("Red", "purring");
        c1.printCat();
        c2.printCat();
        c3.printCat();
        c4.printCat();
        c1.changeColor("Blue");
        c3.changeColor("Purple");
        c1.printCat();
        c3.printCat();
    }

}