/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachapter1;

import java.util.Date;
/**
 *
 * @author Samreach Yan
 */
public class TheDateClass {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("The elapsed time since 01 Jan 1970 is " + date.getTime() +" millions seconds.");
        
        System.out.println("\nThen this is " + date.toString());
    }
}
