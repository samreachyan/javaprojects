/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample;

/**
 *
 * @author Sabay Play
 */
public class PolymorphismDemo {
    public static void main(String[] args){
        displayObject(new Circle4(1, "red", false));
        displayObject(new Rectangle1(1,1,"black", true));
    }
    
    public static void displayObject(GeometricObject1 object){
        System.out.println("Created on "+ object.getDateCreated() + ". Color is "+ object.getColor());
    }
}
