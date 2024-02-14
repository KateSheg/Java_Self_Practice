package day14.practice.car_task;

public class Nio extends Car implements AutoPark, AutoPilot{
  
  public Nio(String model, int year, int price, String color) {
    super("Nio", model, year, price, color);
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
  
  public void selfDrive() {
    if (hasAutoPilot) System.out.println(this.getClass().getSimpleName() + " has autopilot");
    else System.out.println(this.getClass().getSimpleName() + " has NO autopilot");
  }
}
