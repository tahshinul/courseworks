package problem.pkg13;
import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numebers do you want ? : ");
        int n = sc.nextInt();
        for (int i=1; i <=n ; i++) {
            System.out.print(i);
        }
        for (int j=n-1; j>=1; j--) {
            System.out.print(j);
        }
    }
    
}
