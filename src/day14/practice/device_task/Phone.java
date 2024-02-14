package day14.practice.device_task;

public class Phone extends Device{
  
  public Phone(String brand, String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
    super(brand, model, price, color, size, hasBattery,hasPowerButton);
  }
  
  public void call(long phoneNum) {
    System.out.println(getClass().getSimpleName() + " is calling " + phoneNum);
  }
  
  public void text(long phoneNum) {
    System.out.println(getClass().getSimpleName() + " is texting " + phoneNum);
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
