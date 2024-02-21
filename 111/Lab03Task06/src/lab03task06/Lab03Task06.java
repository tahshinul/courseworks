/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03task06;
import java.util.Scanner;
public class Lab03Task06 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String s = scanner.next();
        System.out.println(s);
        System.out.println(s.concat("==THE END=="));
        System.out.println(s);
    }
    
}
