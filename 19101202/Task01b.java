import java.util.*;
  public class Task01b{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please type quantity of columns");
      int columnQuantity = sc.nextInt();
      
      int columnCount = 1;
      while(columnCount <= columnQuantity) {
        System.out.print(columnCount);
        ++columnCount;
      }
      System.out.println();
    }
  }
        