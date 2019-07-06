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
public class Rectangle1 extends GeometricObject1 {
    private double width;
    private double height;
    
    public Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle1(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double detHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    
}
