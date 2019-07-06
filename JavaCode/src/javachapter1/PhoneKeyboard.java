/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachapter1;

import java.util.Scanner;


public class PhoneKeyboard {
    public static void main(String[] args){
        System.out.println("Enter a string : ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toUpperCase();
        
        System.out.println("");
        for( int i=0 ; i<word.length() ; i++){
            if ( Character.isLetter(word.charAt(i)) ){
                System.out.print(getNumber(word.charAt(i)));
            }
            else{
                System.out.print(word.charAt(i));
            }
        }
        System.out.println("\n\nMade by YAN Samreach");
    }
    public static int getNumber(char uppercaseLetter){
        switch (uppercaseLetter){
            case 'A':
            case 'B':
            case 'C': return 2;   
            case 'D':
            case 'E':
            case 'F': return 3;   
            case 'G':
            case 'H':
            case 'I': return 4;   
            case 'J':
            case 'K':
            case 'L': return 5;
            case 'M':
            case 'N':
            case 'O': return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S': return 7;
            case 'T':
            case 'U':
            case 'V': return 8;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z': return 9;
        }
        return 0;
    }
}
