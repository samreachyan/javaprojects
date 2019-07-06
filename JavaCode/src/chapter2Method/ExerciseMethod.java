/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2Method;

/**
 *
 * @author Samreach Yan
 *
*/
public class ExerciseMethod {
    private static boolean myNumber(int n){
          
        String num="" + n ; // 518 string
        int sum=0;
        for (int i=0 ; i<num.length(); i++){
            int a = Integer.valueOf(""+num.charAt(i));
            sum += Math.pow(a, i+1);
        }
        if (sum == n)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args){
        for (int i=1 ; i<=10000 ; i++){
            if (myNumber(i)){
                System.out.println(i);
            }
        }
    }
    
}
