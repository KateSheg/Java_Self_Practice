package day14.practice.device_task;

public abstract class Computer extends Device{
  
  public Computer(String brand, String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
    super(brand, model, price, color, size, hasBattery,hasPowerButton);
  }
  
  @Override
  public String toString() {
    return getClass().getSimpleName() + super.toString();
  }
  
  public void turnOn() {
    System.out.println(getClass().getSimpleName() + " is turning on");
  }
  
  public void turnOff() {
    System.out.println(getClass().getSimpleName() + " is turning off");
  }
}
