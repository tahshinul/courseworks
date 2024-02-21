import java.util.Scanner;
public class Task11a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
       for(int spaceCount = 1; spaceCount <= lineQuantity-lineCount; ++spaceCount){
         System.out.print(" ");
       }
       
       int term = lineQuantity-lineCount+1;
       for(int columnCount = 1; columnCount <= lineCount; ++columnCount){
              System.out.print(term);
              ++term;
         }
         System.out.println();
          
     }
  }
}
         