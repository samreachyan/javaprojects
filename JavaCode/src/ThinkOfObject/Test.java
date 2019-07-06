/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThinkOfObject;

/**
 *  this file connected with Student class file
 * @author Samreach Yan
 */

public class Test {
    public static void main(String[] args){
        Student student = new Student(111223333 , "Samreach");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000);
    }
}
