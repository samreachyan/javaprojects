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
public class CastingDemo {
    public static void main(String[] args){
        Object object1 = new Circle4(3);
        Object object2 = new Rectangle1(2,5);
        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        if (object instanceof Circle4){
            System.out.println("The circle area is "+ ((Circle4)object).getArea());
            System.out.println("The circle diameter is "+ ((Circle4)object).getDiameter());
        }
        else if (object instanceof Rectangle1){
            System.out.println("The rectangle area is "+ ((Rectangle1)object).getArea());
        }
    }
    
}
