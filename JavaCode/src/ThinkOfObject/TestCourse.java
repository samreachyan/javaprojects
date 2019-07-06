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
public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Data Systems");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Yan Samreach");
        course1.addStudent("Whoare Sam");
        
        course2.addStudent("Yan Samrh");
        course2.addStudent("Yan Saeach");
        
        System.out.println("Number of students in course 1 : "+ course1.getNumberOfStudents() );
        String [] students = course1.getStudents();
        
        for (int i=0 ; i< course1.getNumberOfStudents() ; i++){
            System.out.print(students[i]+ ", ");
        }
        System.out.println("\n");
        System.out.println("Number of students in course 2 : " + course2.getNumberOfStudents());
        String [] students1 = course2.getStudents();
        
        for (int i=0 ; i< course2.getNumberOfStudents() ; i++){
            System.out.print(students1[i]+ ", ");
        }
        System.out.println();
    }
}
