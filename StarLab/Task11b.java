import java.util.Scanner;
public class Task11b {
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
       
       int term = lineQuantity-lineCount+1;
       int columnCount = 1;
       while(columnCount <= lineCount){
         System.out.print(term);
         ++term;
         ++columnCount;
       }
       
       System.out.println();
       ++lineCount;
     }
  }
}