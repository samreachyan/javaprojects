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

public class GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    public GeometricObject(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    public GeometricObject(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // this is for set another side user want...
    
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide1(){
        return this.side1 ;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public double getSide3(){
        return this.side3;
    }
    
    public double getArea(){
        return Math.sqrt(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3) );
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = "+ side2 + " side3 = "+ side3 ;
    }
    
}
