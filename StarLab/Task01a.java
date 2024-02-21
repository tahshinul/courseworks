import java.util.Scanner;
public class Task01a {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of columns:");
     int columnQuantity = scanner.nextInt();
     
     for(int columnCount = 1; columnCount <= columnQuantity; ++columnCount){
         System.out.print(columnCount);
     }
     System.out.println();
  }
}