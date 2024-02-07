package day12.practice.circle;

public class CircleClients {
  
  public static void main(String[] args) {
    Circle c = new Circle();
    System.out.println("r = " + c.getR());
    c.setR(7);
    System.out.println("r = " + c.getR());
    System.out.println("area = " + c.calcArea());
    System.out.println("perimeter = " + c.calcPerimeter());
    System.out.println(c);
  }
}
