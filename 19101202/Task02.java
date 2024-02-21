import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("please enter quantity of stars");
        int starQuantity = scanner.nextInt();
        
        for(int columnCount=1; columnCount <= starQuantity; ++columnCount){
            System.out.print('*');
        }
    }
}
        
            