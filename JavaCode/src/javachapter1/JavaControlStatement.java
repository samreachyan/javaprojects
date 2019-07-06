/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachapter1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Samreach Yan
 */
public class JavaControlStatement {
    public static void main(String[] args){
        double hour , total;
        
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the hours : ");
        hour = cin.nextInt();
        if (hour >= 100){
            double extra;
            extra = hour -100;
            if ( extra> 20){
                total = 100 + extra * 1.5 ;
                System.out.println("Your salary is "+ df.format(total) );
            }
            else{
                total = 100 + extra * 1.25 ;
                System.out.println("Your salary is "+ df.format(total) );
            }
        }
        else{
           total = hour * 0.5;
           System.out.println("Your salary is "+ df.format(total) );
        }
    }
}