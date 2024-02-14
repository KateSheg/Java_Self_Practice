package day14.practice.device_task;

public class Google  extends Phone implements Downloadable, AppleApps{
  
  public Google(String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
    super("Google", model, price, color, size, hasBattery,hasPowerButton);
  }
  
}
