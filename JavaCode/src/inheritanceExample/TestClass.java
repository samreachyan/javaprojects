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
public class TestClass {
    public static void main(String[] args){
        Fruit fruit = new Gold();
        System.out.println("");
        Orange orange = new Orange();
        System.out.println("");
        Object fruit2 = new Fruit();
        
        
    }
}
class Fruit{
    public Fruit(){
        System.out.println("Fruit.");
    }
    
}
class Apple extends Fruit {
    public Apple(){
        System.out.println("Apple");
    }
}
class Orange extends Fruit{
    public Orange(){
        System.out.println("Orange");
    }
}
class Gold extends Apple{
    public Gold(){
        System.out.println("Gold");
    }
    
}
class Macintosh extends Apple{
    public Macintosh(){
        System.out.println("Macintosh.");
    }
}
