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
public class TestCircleRectangle {
    public static void main(String[] args){
        Circle4 circle = new Circle4(2);
        System.out.println("A circle "+ circle.toString());
        System.out.println("The radius is "+ circle.getRadius());
        System.out.println("The area is "+ circle.getArea());
        System.out.println("The diameter is "+ circle.getDiameter());
        
        Rectangle1 rectangle = new Rectangle1(2,8);
        System.out.println("\n\nA rectangle "+ rectangle.toString());
        System.out.println("The area is "+ rectangle.getArea());
        System.out.println("The perimeter is "+ rectangle.getPerimeter());
    }
}
