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
public class GeometricObject1 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject1(){
        dateCreated = new java.util.Date();
    }
    
    public GeometricObject1(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public String toString(){
        return "Created on "+ dateCreated + "\ncolor: " + color +" and flled: "+ filled;
    }
}
