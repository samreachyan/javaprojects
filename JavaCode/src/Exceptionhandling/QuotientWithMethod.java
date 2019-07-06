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
public class QuotientWithMethod {
    
    public static int quotient(int number1, int number2){
        if (number2 == 0)
            throw new ArithmeticException("Division connot by zero.");
        
        return number1 / number2 ;
    }
    
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter two integers: ");
        int number1 = cin.nextInt();
        int number2 = cin.nextInt();
        
        try {
            int result = quotient ( number1 , number2 );
            System.out.println("The result is " + result);
            
        } catch (ArithmeticException ex) {
            System.out.println("Exception an integer cannot be divided zero.");
        }
        
        System.out.println("Exception continue .... ");
    }
}
