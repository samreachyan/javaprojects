/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptionhandling;

/**
 *
 * @author Sabay Play
 */
public class TestException {
    public static void main(String[] args){
        try{
            System.out.println(sum(new int [] {1,2,3,4,5} ));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage()) ;
            System.out.println("\n" + ex.toString()) ;
            
            System.out.println("\nTrace Info Obtained fromm getStackTrace");
            StackTraceElement [] traceElements = ex.getStackTrace(); 
            for ( int i = 0 ; i < traceElements.length ; i++){
                System.out.println("method " + traceElements[i].getMethodName() );
                System.out.println("("+ traceElements[i].getClassName() + " : " );
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }
    
    private static int sum(int [] list){
        int result = 0 ; 
        for (int i=0 ; i<= list.length ; i++){
            result += list[i];
        }
        return result;
    }
}
