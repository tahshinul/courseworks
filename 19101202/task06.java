import java.util.*;
public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuanitity = scanner.nextInt();
        
        for(int lineCount = 1; lineCount <= lineQuanitity; ++lineCount) {
            
            for(int numberCount = 1; numberCount <= lineCount; ++numberCount) {
                System.out.print(numberCount);
            }
            System.out.println();
        }
    }
}