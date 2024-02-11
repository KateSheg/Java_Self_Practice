package day13.practice.phone;

public class IPhone extends Phone{
  
  public IPhone(String model, double price, String size, String color) {
    super("iPhone", model, price, size, color);
  }
  
  @Override
  public String toString() {
    return displayInfo(getModel(), getSize(), getPrice(), getSize());
  }
  
  
}
