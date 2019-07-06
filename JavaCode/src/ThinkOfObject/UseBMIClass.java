/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

import java.util.Scanner;

/**
 *
 * @author Samreach Yan
 */
public class UseBMIClass {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String name;
        int age, heigth, weigth;
        System.out.println("Input name : ");  name = cin.nextLine();
        System.out.println("Input age, heigth, weigth : "); 
        age = cin.nextInt();
        heigth = cin.nextInt();
        weigth = cin.nextInt();
        
        BMI bmil = new BMI(name , age, heigth, weigth); // age heigth weigth
        System.out.println("The BMI for "+ bmil.getName() + " is "+ bmil.getBMI() + " "+ bmil.getStatus());

    }
}
