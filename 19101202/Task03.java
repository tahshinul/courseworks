import java.util.*;
public class Task03 {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("please type quantity of lines");
    int lineQuantity = scanner.nextInt();
    System.out.println("please type quantity of stars");
    int starQuantity = scanner.nextInt();
    
    int lineCount = 1;
    while(lineCount <= lineQuantity) {
        
        int starCount =1;
        while(starCount <= starQuantity) {
            System.out.print('*');
            ++starCount;
        }
        
        System.out.println();
        ++lineCount;
    }
  }
}
            
             
