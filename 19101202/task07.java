import java.util.*;
public class task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Quantity of lines");
        int lineQuantity = scanner.nextInt();
        for(int lineCount = 1; lineCount <= lineQuantity; ++lineCount) {
            int spaceCount = 1;
            int spaceQuantity = lineQuantity - lineCount;
            while(spaceCount <= spaceQuantity){
                System.out.print(" ");
                ++spaceCount;
            }
            int starCount=1;
            while(starCount <= lineCount) {
                System.out.print('*');
                ++starCount;
            }
            System.out.println();
        }
    }
}
