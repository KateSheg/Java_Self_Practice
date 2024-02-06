package day11.theory;

import static java.lang.Math.max;

public class StaticImport {
  public static double r;
  
  public StaticImport(double r) {
    this.r = r;
  }
  
  public double area() {
    return Math.PI*Math.pow(r,2);
  }
  
  public static void main(String[] args) {
    //System.out.println(Math.abs(-4));
    StaticImport circle = new StaticImport(4.5);
    int result = max(5, 10);
    System.out.println("maxNumber = " + result);
    System.out.println("area = " + circle.area());
  }
}
