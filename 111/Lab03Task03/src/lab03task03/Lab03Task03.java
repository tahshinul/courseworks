/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03task03;
import java.util.Scanner;
public class Lab03Task03 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String s = scanner.next();
        for(int i=0; i< s.length();++i){
            char ch = s.charAt(i);
            int codeForCh = (int) ch;
            System.out.print(s.charAt(i) + ": ");
            System.out.print(codeForCh);
            System.out.println();
        }
    }
    
}