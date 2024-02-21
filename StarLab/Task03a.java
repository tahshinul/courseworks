import java.util.Scanner;
public class Task03a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     System.out.println("Type the quantity of stars:");
     int starQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
         for(int starCount = 1; starCount <= starQuantity; ++starCount){
             System.out.print('*');
         }
         System.out.println();//print enter after every line of stars
     }
  }
}