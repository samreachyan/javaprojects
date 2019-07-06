/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

import java.util.Scanner;

/**
 *
 * @author Nes Tea
 */
public class ATM {
    
    public static void main(String[] args){
        double balance = 100, send, add;
        
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter your id (1) : ");
        
        int id = cin.nextInt();
        while (id == 1) {
            System.out.println("\nMain menu");
            System.out.println("1: Check balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4. Exit");
        System.out.print("Enter a choice : ");
        int choice = cin.nextInt();
            switch(choice){
                case 1:
                    System.out.println("The balance is "+ balance);
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw : ");
                    send = cin.nextDouble();
                    balance -= send; 
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit : ");
                    add = cin.nextDouble();
                    balance += add;
                    break;
                case 4:
                    System.out.print("Thanks you!!!");
                    break;
            }
            
        }
    }
}