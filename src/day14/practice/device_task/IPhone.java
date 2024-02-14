package day14.practice.device_task;

public class IPhone extends Phone implements Downloadable, AppleApps{
  
  public IPhone(String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
    super("Apple", model, price, color, size, hasBattery,hasPowerButton);
  }

}
