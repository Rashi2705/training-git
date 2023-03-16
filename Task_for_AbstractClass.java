import java.lang.Math;
import java.util.Scanner;
abstract class Shape{
    public abstract double perimeter();
    public abstract double area();
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double perimeter(){
        
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }

   
}
class rectangle extends Shape{
double length,breadth;
public rectangle(double length,double breadth){
    this.length=length;
    this.breadth=breadth;
}
    @Override
    public double perimeter() {
       return 2*(length+breadth);
       
    }

    @Override
    public double area() {
       return length*breadth;
    }       
    
}
 class abstractClassTask {
    public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter Radius of Circle");
double radius=s.nextDouble();
Circle obj1=new Circle(radius);
System.out.println("The Area of circle is: "+obj1.area()+" The Perimeter of circle is "+obj1.perimeter());
System.out.println("Enter the length and breadth of rectangle");
double length=s.nextDouble();
double breadth=s.nextDouble();
rectangle obj2=new rectangle(length, breadth);
System.out.println("The Area of rectangle is: "+obj2.area()+" The Perimeter of rectangle is "+obj2.perimeter());
    }
}