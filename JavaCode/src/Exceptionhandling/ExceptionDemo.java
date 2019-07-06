package Exceptionhandling;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter value a : ");
        int a = cin.nextInt();
        System.out.print("Enter value b : ");
        int b = cin.nextInt();
        
        try {
            int result = a/b;
            System.out.println("The result is " + result);
        } catch (Exception e) {
            System.out.println("\nDon't input b = zero ");
        } finally {
            System.out.println("Hello This is finallly exception.");
        }
        
        System.out.println("The Ended!!");
        
    }
}