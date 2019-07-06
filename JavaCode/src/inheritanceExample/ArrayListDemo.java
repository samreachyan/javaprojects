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
public class ArrayListDemo {
    public static void main(String[] args){
        java.util.ArrayList cityList = new java.util.ArrayList();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Phnom Penh");
        cityList.add("Tokyo");
        
        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? "+ cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? "+ cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());
        
        cityList.add(2, "Xian");
        cityList.remove("Miami");
        cityList.remove(1);
        
        System.out.println(cityList.toString());
        
        // show the cityList alternative index 
        for (int i= cityList.size()-1 ; i>=0 ; i--){
            System.out.print(cityList.get(i) + ", ");
        }
        
    }
}
