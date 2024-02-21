import java.util.Scanner;
public class Task17a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
       for(int columnCount = 1; columnCount <= lineCount; ++columnCount){
           if(columnCount == 1||columnCount == lineCount||lineCount == 1||lineCount ==lineQuantity){
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