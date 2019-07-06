/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

import java.util.Scanner;

/**
 *
 * @author Nes Tea
 */
public class DistandMainClass {
    public static void main(String[] args){
        System.out.println("Hello this is the class.");
        System.out.println("Enter an the x and y coordinator.\n\n");
        
        MyPoint a = new MyPoint();
        a.ShowDistand(3, 4);
        MyPoint b = new MyPoint();
        a.ShowDistand();
    }
}
