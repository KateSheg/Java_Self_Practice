package day14.practice.device_task;

public class Samsung extends Phone implements Downloadable, AppleApps {
  
  public Samsung(String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
    super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
  }
  
}
