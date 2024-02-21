import java.util.Scanner;
public class Task06a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
         for(int columnCount = 1; columnCount <= lineCount; ++columnCount){
             System.out.print(columnCount);
         }
         System.out.println();//print enter after every line of stars
     }
  }
}
     