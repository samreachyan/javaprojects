/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

// Why this program error with args[] 

// I dont understand why this happenned

public class CalculatorJava {
    public static void main(String[] args){
        if(args.length !=3){
            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(0);
        }
        int result = 0;
        switch( args[1].charAt(0)){
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}