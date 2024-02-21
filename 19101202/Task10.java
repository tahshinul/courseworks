import java.util.*;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of lines");
        int lineQuantity = scanner.nextInt();
        for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount) {
            int spaceCount = 1;
            int spaceQuantity = lineQuantity - lineCount;
            while(spaceCount <= spaceQuantity){
                System.out.print(" ");
                ++spaceCount;
            }
            int numberQuantity = 2*lineCount-1;
            int numberCount = 1;
            while(numberCount <= numberQuantity) {
                System.out.print(numberCount);
                ++numberCount;
            }
            System.out.println();
        }
    }
}
       