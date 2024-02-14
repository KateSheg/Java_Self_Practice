package day14.practice.car_task;

public class Toyota extends Car{
  
  private static final String brandTextColor = "cyan";
  
  public Toyota(String model, int year, int price, String color) {
    super("Toyota", model, year, price, color);
  }
  
  public void start() {
    System.out.println(inColor("Toyota is starting", brandTextColor));
  }
  
  public void drive() {
    System.out.println(inColor("Toyota is driving", brandTextColor));
  }
}
