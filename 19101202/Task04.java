import java.util.*;
public class Task04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuantity = scanner.nextInt();
        System.out.println("Please enter quantity of numbers");
        int numberQuantity = scanner.nextInt();
        
        for(int lineCount = 1; lineCount <= lineQuantity ; ++lineCount) {
            
            for(int numberCount = 1; numberCount <= numberQuantity ; ++numberCount) {
                System.out.print(numberCount);
            }
            System.out.println();
        }
    }
}
                