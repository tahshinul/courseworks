package lab03task07;
import java.util.Scanner;
public class Lab03Task07 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String s1 = scanner.next();
        System.out.println("Please enter another word: ");
        String s2 = scanner.next();
        System.out.print("Please enter the first letter to check: ");
        String F = scanner.next();
        System.out.print("Please enter the last letter to check: ");
        String L = scanner.next();
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.print("Return Value :" );
        System.out.println(s1.startsWith(F) );
        System.out.print("Return Value :" );
        System.out.println(s1.endsWith(L) );
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.lastIndexOf(s2));
        System.out.println();
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s2));
        
    }
    
}
