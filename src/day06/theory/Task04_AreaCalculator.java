package day06.theory;

public class Task04_AreaCalculator {
  public static void main(String[] args) {
    System.out.println(getAreaOfCircleOrRectangle(5));
    System.out.println(getAreaOfCircleOrRectangle(4, 6));
  }
  
  public static String getAreaOfCircleOrRectangle(double r) {
    return "Area of the circle: " + 3.14 * Math.pow(r, 2);
  }
  
  public static String getAreaOfCircleOrRectangle(double l, double w) {
    return "Area of the rectangle: " + l * w;
  }
}
