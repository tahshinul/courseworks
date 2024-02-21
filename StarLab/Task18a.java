import java.util.Scanner;
public class Task18a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
       for(int spaceCount = 1; spaceCount <= lineQuantity-lineCount; ++spaceCount){
             System.out.print(" ");
         }
       
       for(int starCount = 1; starCount <= lineCount; ++starCount){
           if(starCount == 1||starCount == lineCount||lineCount == 1||lineCount ==lineQuantity){
             System.out.print('*');
           } 
           else{
             System.out.print(" ");
           }
         }
         System.out.println();
      }
  }
}