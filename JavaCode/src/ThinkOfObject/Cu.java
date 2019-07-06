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
public class Cu {
  String name;
  public Cu(String n){
    name = n;
  }
  public Cu(){
    name = "unknown";
  }
  public void printName(){
    System.out.println(name);
  } 
    public static void main(String[] args){
        Cu a = new Cu("xyz");
        Cu b = new Cu();
        a.printName();
        b.printName();
  }
}