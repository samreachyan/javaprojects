package Exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args){
        java.io.PrintWriter output = null ;
        
        try {
            output = new java.io.PrintWriter("textFinallyDemo.txt");
            output.println("Welcome to Java Porgraming wrote by Samreach");
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        } finally {
            if (output != null) output.close();
        }
        
        System.out.println("The programming ended.... !! ");
    }
}
