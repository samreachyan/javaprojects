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
public class ConstractorOverload {
    int id;
    String name;
    int age;
    
    ConstractorOverload(int id, String name){
        this.id = id;
        this.name = name;
    }
    ConstractorOverload (int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age= age;
    }

    void display(){
        System.out.println("This is the display : "+ id +" " + name +" "+ age);
    }
    public static void main(String[] args){
        ConstractorOverload a = new ConstractorOverload(122, "Samreach");
        ConstractorOverload b = new ConstractorOverload (113, "Hahah" , 21);
        
        a.display();
        b.display();
    }
}
