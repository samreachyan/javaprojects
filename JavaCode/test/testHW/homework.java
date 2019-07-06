/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHW;

/**
 *
 * @author reach
 */
public class homework {
    
    
    public static void main(String []args ){
    
        //for (int m=0 ; m<=2 ; m++ ){
            for (int i=0 ; i<=5 ; i++){
                System.out.print(" " + A(0,i));
            }
            System.out.println("");
       // }
        
    }

    private static int A(int m, int n) {
        if (m==0) return 2*n;
        if (m>=1 && n==0 ) return 0;
        if (m>=1 && n==1 ) return 2; 
        
        return A(n-1, (int)A(m, n-1));
    }
}
