import java.util.Scanner;
public class Task08a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
      
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){    
         for(int spaceCount = 1; spaceCount <= lineQuantity-lineCount; ++spaceCount){
             System.out.print(" ");
         }
         
         for(int columnCount = 1; columnCount <= lineCount; ++columnCount){
             System.out.print(columnCount);
         }
         System.out.println();
          
     }
  }
}