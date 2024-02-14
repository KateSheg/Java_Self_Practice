package day14.practice.device_task;

public class DeviceShop  {
  public static void main(String[] args) {
    Computer comp = new Computer("Bosh", "dishwasher eee45", 2000, "black", "standard", false, true) {};
    comp.turnOn();
    comp.turnOff();
    comp.setHasBattery(false);
    System.out.println(comp);
    
  }
}
