package day14.practice.car_task;

public class BMW extends Car{
  private static final String brandTextColor = "yellow";
  
  public BMW(String model, int year, int price, String color) {
    super("BMW", model, year, price, color);
  }
  
  public void start() {
    System.out.println(inColor(this.getClass().getSimpleName() + " is starting", brandTextColor));
  }
  
  public void drive() {
    System.out.println(inColor(this.getClass().getSimpleName() + " is driving",brandTextColor));
  }
}
