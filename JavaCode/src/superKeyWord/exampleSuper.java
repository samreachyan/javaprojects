/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superKeyWord;

/**
 *
 * @author Sabay Play
 */
public class exampleSuper extends Employee {
    public static void main(String[] args){
        new exampleSuper();
    }
    public exampleSuper(){
        System.out.println("(4) Performs super word's task.");
    }
}

class Employee extends Person{
    public Employee(){
        this("(2) Invoke Employee's overloaded constructor."); 
        // this meaan that Employee(String)
        // for calling constructor return String value
        
        System.out.println("(3) Performs Employee's task.");
    }
    // support with this keyword.
    public Employee(String s){
        System.out.println(s);
    }
}

class Person{
    public Person(){
        System.out.println("(1) Perform super class of Person class.");
    }
}