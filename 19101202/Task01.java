  import java.util.*;
  public class Task01{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please type quantity of columns");
        int columnQuantity = sc.nextInt();
      
      for(int columnCount =1 ; columnCount <= columnQuantity ; ++columnCount){
        System.out.print(columnCount);
      }
      System.out.println();
    }
  }
  