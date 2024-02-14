package day14.practice.car_task;

public class Mercedes extends Car implements AutoPark{
  
  public Mercedes(String model, int year, int price, String color) {
    super("Mercedes", model, year, price, color);
  }
  
  public void start() {
    System.out.println(this.getClass().getSimpleName() + " is starting");
  }
  
  public void drive() {
    System.out.println(this.getClass().getSimpleName() + " is driving");
  }
  
  public void autoPark() {
    if (hasAutoPark) System.out.println(this.getClass().getSimpleName() + " has autopark");
    else System.out.println(this.getClass().getSimpleName() + " has NO autopark");
  }
}
