package day14.practice.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{
  
  private static final String brandTextColor = "blue";
  
  public CydeoCar(String model, int year, int price, String color) {
    super("CydeoCar", model, year, price, color);
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
  
  public void selfDrive() {
    if (hasAutoPilot) System.out.println(inColor(this.getClass().getSimpleName() + " has autopilot",brandTextColor));
    else System.out.println(inColor(this.getClass().getSimpleName() + " has NO autopilot",brandTextColor));
  }
  
  public void fly() {
    if (canFly) System.out.println(inColor(this.getClass().getSimpleName() + " can fly",brandTextColor));
    else System.out.println(inColor(this.getClass().getSimpleName() + " can NOT fly",brandTextColor));
  }
  
  public String toString() {
    return  super.toString() + inColor(", autopark=" + hasAutoPark + ", autopilot=" + hasAutoPilot + ", can fly=" + canFly,brandTextColor);
    
  }
}
