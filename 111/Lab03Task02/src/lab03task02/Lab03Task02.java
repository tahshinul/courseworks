package lab03task02;
import java.util.Scanner;
public class Lab03Task02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String s = scanner.next();
        for(int i=0; i< s.length();++i){
            System.out.println(s.charAt(i));
        }
    }
    
}