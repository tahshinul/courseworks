import java.util.Scanner;
public class Task02b {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Type the quantity of columns:");
     int columnQuantity = scanner.nextInt();
     
     int columnCount = 1;
     while(columnCount <= columnQuantity){
       System.out.print('*');
       ++columnCount;
     }
     
     System.out.println();
     
  }
}