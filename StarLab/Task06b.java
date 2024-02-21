import java.util.Scanner;
public class Task06b {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     int lineCount = 1; 
     while(lineCount <= lineQuantity){
         int columnCount = 1;
         while( columnCount <= lineCount){
             System.out.print(columnCount);
             ++columnCount;
         }
         System.out.println();//print enter after every line of stars
         ++lineCount;
     }
  }
}
     