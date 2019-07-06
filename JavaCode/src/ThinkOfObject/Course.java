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
public class Course {
    private String courseName;
    private String [] students = new String [100];
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public String [] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String students){
        // nothing input here;
    }
}
