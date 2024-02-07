package day12.practice.rectangle;

public class RectangleClients {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.setLength(2);
    r1.setWidth(5);
    System.out.println(r1);
    
    Rectangle r2 = new Rectangle(3, 5.6);
    System.out.println(r2);
  }
}
