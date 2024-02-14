package day14.practice.car_task;

public class Honda extends Car{
  
  private static final String brandTextColor = "green";
  
  public Honda(String model, int year, int price, String color) {
    super("Honda", model, year, price, color);
  }
  
  public void start() {
    System.out.println(inColor(this.getClass().getSimpleName() + " is starting", brandTextColor));
  }
  
  public void drive() {
    System.out.println(inColor(this.getClass().getSimpleName() + " is driving",brandTextColor));
  }
}
