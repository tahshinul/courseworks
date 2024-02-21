import java.util.*;
public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter quantity of lines");
        int lineQuanitity = scanner.nextInt();
        
        for( int lineCount = 1; lineCount <= lineQuanitity; ++lineCount) {
            
            for( int starCount = 1; starCount <= lineCount; ++starCount) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
        
    