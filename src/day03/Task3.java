package day03;

public class Task3 {
  public static void main(String[] args) {
    boolean b1 = true, b2 = true;
    
    int y = 20;
    b1 = (y != 10) || (b2 = false);
    
    System.out.println("b1 = " + b1);
    System.out.println("b2 = " + b2);
  }
}
