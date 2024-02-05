package day07.practice;

public class Order {
  public String productName;
  public double price;
  public int quantity;
  public String firstName;
  
  public double total() {
    return price*quantity;
  }
  
  public String toString() {
    return firstName + ", your order for " + quantity + " " + productName +
            " has been placed. Your total is $" + total() + ".";
  }
  
}
