package day13.practice.phone;

public class Samsung extends Phone{
  public Samsung(String model, double price, String size, String color) {
    super("Samsung", model, price, size, color);
  }
  
  @Override
  public String toString() {
    return displayInfo(getModel(), getSize(), getPrice(), getSize());
  }
}