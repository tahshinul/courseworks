import java.util.Scanner;
public class Task24 {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of lines:");
     int lineQuantity = scanner.nextInt();
     
     for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){ 
       System.out.print(lineCount);
     }
     
     for(int lineCount = lineQuantity-1; lineCount >= 1; --lineCount){
       System.out.print(lineCount);
     }
  }
}