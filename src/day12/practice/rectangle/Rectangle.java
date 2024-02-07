package day12.practice.rectangle;

import java.text.DecimalFormat;

public class Rectangle {
  private double width;
  private double length;
  
  public Rectangle() {
  }
  
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }
  
  public double getWidth() {
    return width;
  }
  
  public double getLength() {
    return length;
  }
  
  public void setWidth(double width) {
    if (width>0) {
      this.width = width;
    }
    else {
      System.err.println("width must be >=0");
      System.exit(1);
    }
  }
  
  public void setLength(double length) {
    if (length>0) {
      this.length = length;
    }
    else {
      System.err.println("length must be >=0");
      System.exit(1);
    }
  }
  
  public double calcArea() {
    return width*length;
  }
  
  public double calcPerimeter() {
    return 2*(width+length);
  }
  
  public String toString() {
    DecimalFormat f = new DecimalFormat("##.00");
    return "This rectangle has length=" + length + " and width=" + width +
            ", area=" + f.format(calcArea()) + ", perimeter=" + f.format(calcPerimeter());
  }
  
}
