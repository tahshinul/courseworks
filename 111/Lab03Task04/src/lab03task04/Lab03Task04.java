package lab03task04;
import java.util.Scanner;
public class Lab03Task04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int [256];
        System.out.println("Please enter your word: ");
        String s = scanner.next();
        for(int i=0; i< s.length();++i){
            int m = s.codePointAt(i);
            a[m] = a[m]+1;
        }
        for(int i = 65; i < 90; ++i){
            char x = (char)i;
            System.out.print(x + " which is " +i+ " was found " +a[i]+ " times");
            System.out.println();
            
        }
    }
    
}
