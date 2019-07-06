/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author Sabay Play
 */
public class QuotientWithException {
    public static void main (String[] args){
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter two integers : ");
        int number1 = cin.nextInt();
        int number2 = cin.nextInt();
        
        try {
            
            if ( number2 == 0 ){
                throw new ArithmeticException("Divisor cannot be zero");
            }
         
            System.out.println("The result is " + (number1/number2));
            
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer " + " cannot be divided by zero.");
        }
        
        System.out.println("Exception continues .... ");
    }
}
