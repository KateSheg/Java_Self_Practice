package day11.practice;

public class Carpet {
  public static final int UNIT_PRICE = 20;
  public static final int PERSIAN = 200;
  public double width;
  public double length;
  public boolean isPersian;
  
  public Carpet(double width, double length, boolean isPersian) {
    this.width = width;
    this.length = length;
    this.isPersian = isPersian;
  }
  
  public double calcCost() {
    double sum = 0;
    sum += (width*length)*UNIT_PRICE;
    if (isPersian) sum += PERSIAN;
    return sum;
  }
  
  @Override
  public String toString() {
    return "Carpet: " +
            "width=" + width +
            ", length=" + length +
            ", isPersian=" + isPersian +
            "\nTotal cost: $" + calcCost();
  }
  
  public static void main(String[] args) {
    Carpet c1 = new Carpet(2,3,false);
    System.out.println("\nc1 " + c1);
    Carpet c2 = new Carpet(5,3,true);
    System.out.println("\nc2 " + c2);
    Carpet c3 = new Carpet(1,1,false);
    System.out.println("\nc3 " + c3);
  }
}
