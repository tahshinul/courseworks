/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author TAHSHIN
 */
import java.util.*;
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in );
        System.out.println("Please enter maximum price :");
        int m = sc.nextInt();
        System.out.println("Please enter no of shortlisted players :");
        int s = sc.nextInt();
        String[] player = new String[s];    
        String[] position = new String[s];  
        int[] price = new int[s];    
        int[] form = new int[s];     
        System.out.println("Enter the details of players: ");
        for(int i=0; i<s; i++){
            player[i] = sc.next();
            price[i] = sc.nextInt();
            form[i] = sc.nextInt();
            position[i] = sc.nextLine();
        }
    
        System.out.println("Bought Players: ");
        for(int i=0; i<s; i++){
        if(price[i] + price[i+1] + price[i+2] == m){
            
            System.out.println(player[i]+" -> "+ player[i+1]+" -> "+ player[i+2] );
            int sum = form[i]+ form[i+1]+ form[i+2];
            System.out.println("Maximum summation of form: "+sum);
        }
        }
    }
    
}
