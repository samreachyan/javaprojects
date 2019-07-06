/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

/**
 *
 * @author Nes Tea
 */
public class MyPoint {
    private int x;
    private int y;
   
    public void getDistand (int x, int y){
        this.x = x;
        this.y = y;
    }    
    
    public void ShowDistand (){
        System.out.println("The distand is started from 0.0 " );
    }
    public void ShowDistand (int x, int y){
        System.out.println("The distand is "  + Math.sqrt(x*x + y*y));
    }
    
    
}
