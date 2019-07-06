/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

/**
 *
 * @author Samreach Yan
 */
public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public static final double KILOGRAM = 0.45359237;
    public static final double METERS = 0.0254;
    
    public BMI (String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        
    }
    
    public BMI(String name, double weight, double height){
        this(name, 20, weight, height);
    }
    
    public double getBMI(){
        double bmi = weight * KILOGRAM /((height * METERS) * (height *METERS));
        return Math.round(bmi * 100) / 100.0 ;
    }
    
    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 16)
            return "Seriously underweight.";
        else if (bmi <18 ) 
            return "underweight.";
        else if (bmi <24)
            return "normal weight.";
        else if (bmi <29 )
            return "overweight.";
        else if (bmi < 35)
            return "seriously overweight.";
        else
            return "Gravely overweight.";
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getHeight(){
        return height;
    }
}
