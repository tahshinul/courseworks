import java.util.*;
public class Task03b {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("please type quantity of lines");
    int lineQuantity = scanner.nextInt();
    System.out.println("please type quantity of stars");
    int starQuantity = scanner.nextInt();
    
    for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
        
        for(int starCount = 1 ; starCount <= starQuantity; ++starCount){
            System.out.print('*');
        }
        System.out.println();
    }
  }
}