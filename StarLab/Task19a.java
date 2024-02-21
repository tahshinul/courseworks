import java.util.Scanner;
public class Task19a {
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
         if(columnCount == 1||columnCount == lineCount||lineCount == 1||lineCount ==lineQuantity){
             System.out.print(term);
         } 
         else{
             System.out.print(" ");
         }
         ++term;
       }
       System.out.println();
          
     }
  }
}
         