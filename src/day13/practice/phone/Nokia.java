package day13.practice.phone;

public class Nokia extends Phone{
  public Nokia(String model, double price, String size, String color) {
    super("Nokia", model, price, size, color);
  }
  
  @Override
  public String toString() {
    return displayInfo(getModel(), getSize(), getPrice(), getSize());
  }
}