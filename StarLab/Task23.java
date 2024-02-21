import java.util.Scanner;
public class Task23 {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
       for(int spaceCount = 1; spaceCount <= lineQuantity-lineCount; ++spaceCount){
         System.out.print(" ");
       }
       
       for(int columnCount = 1; columnCount <= 2*lineCount-1; ++columnCount){
           if(columnCount == (2*lineCount-1)||columnCount == 1){
             System.out.print(columnCount);
           } 
           else{
             System.out.print(" ");
           }
       }
       
       System.out.println();
     }
     
     
     for(int lineCount = lineQuantity-1; lineCount >= 1; --lineCount){
       for(int spaceCount = 1; spaceCount <= lineQuantity-lineCount; ++spaceCount){
         System.out.print(" ");
       }
       
       for(int columnCount = 1; columnCount <= 2*lineCount-1; ++columnCount){
           if(columnCount == (2*lineCount-1)||columnCount == 1){
             System.out.print(columnCount);
           } 
           else{
             System.out.print(" ");
           }
       }
       
       System.out.println();
     }
  }
}