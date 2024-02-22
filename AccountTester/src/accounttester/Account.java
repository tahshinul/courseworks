/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounttester;

/**
 *
 * @author 19101202
 */
public class Account {
    String name;
    int balance;
    public static double interestRate = 5.0;
    public Account() {
    }

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public void nameBoshao(String x) {
        this.name = x;
        
    }
    public void balanceBoshao(int x) {
        this.balance = x;
    }
    public int balanceKi(){
        return balance;
    }
    public String nameKi(){
        return name;
    } 
    public void withdraw(int x) {
        if (balance <x) System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        else {
            balance = balance -x;
            System.out.println("Withdraw successful! New balance is:"+balance);
        }
    }
}
