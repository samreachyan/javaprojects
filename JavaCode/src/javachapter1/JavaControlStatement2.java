/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachapter1;

import java.util.Scanner;

/**
 *
 * @author Samreach Yan
 */
public class JavaControlStatement2 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter 3 digit numbers to convert : ");
        int number = cin.nextInt();
        int first = (number)%10 ;
        int second = (number/10)%10;
        int third = (number/100)%10;
        int result = (first*100)+(second*10)+third;
        System.out.println("The result: "+ result);
        
    }
    
}
