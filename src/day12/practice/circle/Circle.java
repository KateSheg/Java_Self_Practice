package day12.practice.circle;

public class Circle {
  private double r;
  
  public Circle() {}
  
  public Circle(double r) {
    this.r = r;
  }
  
  public void setR(double r) {
    if (r>=0) this.r = r;
    else {
      System.err.print("Re-enter r: ");
      System.exit(1);
    }
  }
  
  public double getR() {
    return r;
  }
  
  public double calcArea() {
    return 3.14*r*r;
  }
  
  public double calcPerimeter() {
    return 2*3.14*r;
  }
  
  public String toString() {
    return "This circle has radius r=" + r + ", area S=" + calcArea() +
            ", perimeter P=" + calcPerimeter();
  }
  
  public static void main(String[] args) {
  
  }
}
