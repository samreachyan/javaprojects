package inheritanceExample;

public class DynamicBindingDemo {
    public static void main(String[] args){
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
class GraduateStudent extends Student{
    
}

class Student extends Person{
    public String toString(){
        return "This is Student in the toString()";
    }
}
class Person extends Object {
    public String toString(){
        return "This is Person class in the toSting()";
    }
}