import java.util.Scanner;
public class Task09b {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     int lineCount = 1;
     while(lineCount <= lineQuantity){
       int spaceCount = 1;
       while(spaceCount <= lineQuantity-lineCount){
         System.out.print(" ");
         ++spaceCount;
       }
       
       int starCount = 1;
       while(starCount <= 2*lineCount-1){
         System.out.print('*');
         ++starCount;
       }
       
       System.out.println();
       ++lineCount;
     }
  }
}