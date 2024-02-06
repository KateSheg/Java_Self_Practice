package day11.theory;

public class Circle {
  public static int numberOfCircles;
  double radius;
  public double area;
  
  public Circle(double radius) {
    this.radius = radius;
    numberOfCircles++;
  }
  
  public double area() {
    return Math.PI*Math.pow(radius, 2);
  }
  
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    System.out.println("\nArea of c1 = " + c1.area() + "\nTotal circles created: " + Circle.numberOfCircles);
    Circle c2 = new Circle(5);
    System.out.println("\nArea of c2 = " + c2.area() + "\nTotal circles created: " + Circle.numberOfCircles);
  }
}
