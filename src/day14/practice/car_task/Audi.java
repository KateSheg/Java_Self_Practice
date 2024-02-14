package day14.practice.car_task;

public class Audi extends Car implements AutoPark{
  
  private static final String brandTextColor = "purple";
  
  public Audi(String model, int year, int price, String color) {
    super("Audi", model, year, price, color);
  }
  
  public void start() {
    System.out.println(inColor(this.getClass().getSimpleName() + " is starting",brandTextColor));
  }
  
  public void drive() {
    System.out.println(inColor(this.getClass().getSimpleName() + " is driving",brandTextColor));
  }
  
  public void autoPark() {
    if (hasAutoPark) System.out.println(inColor(this.getClass().getSimpleName() + " has autopark",brandTextColor));
    else System.out.println(inColor(this.getClass().getSimpleName() + " has NO autopark", brandTextColor));
  }
  
  public String toString() {
    return super.toString() + inColor(", autopark=" + hasAutoPark,brandTextColor);
  }
}
