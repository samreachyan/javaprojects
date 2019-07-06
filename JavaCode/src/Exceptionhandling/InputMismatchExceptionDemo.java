/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptionhandling;

import java.util.*;

/**
 *
 * @author Sabay Play
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        boolean continueInput = true;
        
        do{
            try{
                System.out.print("Enter an integer: ");
                int number = cin.nextInt();
                
                System.out.println("The number is " + number);
                continueInput = false;
            } catch (InputMismatchException ex){
                System.out.println("Try again : ");
                cin.nextInt();
            }
        } while (continueInput);
    }
}