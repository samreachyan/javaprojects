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
public class HomeworkHandle {
    public static void main(String[] args){
        try {
            int value = 30; 
            if (value < 40)
                throw new Exception ("Value is too small");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block.");
    }
    
}