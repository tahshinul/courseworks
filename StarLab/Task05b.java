import java.util.Scanner;
public class Task05b {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     int lineCount = 1; 
     while(lineCount <= lineQuantity){
         int starCount = 1;
         while( starCount <= lineCount){
             System.out.print('*');
             ++starCount;
         }
         System.out.println();//print enter after every line of stars
         ++lineCount;
     }
  }
}
     