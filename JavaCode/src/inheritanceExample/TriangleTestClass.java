package inheritanceExample;
public class TriangleTestClass  {
    public static void main(String[] args){
        /* This is connected from GeometricObject not GeometricObject1 */
        GeometricObject triangle = new GeometricObject(1,1.5,1);
        
        System.out.println("The triangle area is "+ triangle.getArea()
                + "\nThe triangle perimeter is "+triangle.getPerimeter()
                + "\n" +triangle.toString() );
        
        triangle.setSide1(2);
        triangle.setSide2(2.3);
        triangle.setSide3(1.7);
        System.out.println("\nThe triangle area is "+ triangle.getArea()
                + "\nThe triangle perimeter is "+triangle.getPerimeter()
                + "\n" +triangle.toString() );
    }
}