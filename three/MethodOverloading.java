/*Question 3 (Method Overloading)
Create a Shape class with an overloaded calculateArea() method. Implement the following versions of the method:

calculateArea() with no parameters (for a square with side length 10).
calculateArea(double side) for a square.
calculateArea(double length, double width) for a rectangle.
Create objects of the Shape class and call the different calculateArea() methods to calculate the areas of various shapes. T*/

public class MethodOverloading{

    static class Shape{

        public double calculateArea(){
            double area = 10*10;
            return area;
        }
        public double calculateArea(double side){
            return side*side;
        }
        public double calculateArea(double len, double wid){
            return len*wid;
        }
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculateArea(26));
        System.out.println(shape.calculateArea(13,16));
       
    }


}


//Instructor's code below

/*class Shape{
    public double calculateArea(){
        double side =10;
        double area =side * side;
        System.out.println("area of square is "+area);
        return area;
    }
    public double calculateArea(double side){
        double area =side * side;
        System.out.println("area of square is "+area);
        return area;
    }
    public double calculateArea(double length, double width){
        double area =length * width;
        System.out.println("area of square is "+area);
        return area;
    }
}
public class MethodOverloading {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.calculateArea();
        shape.calculateArea(10);
        shape.calculateArea(4.5,6.7);
    }
}
 */