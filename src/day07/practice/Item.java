package day07.practice;

public class Item {
  public String itemName;
  public double unitPrice;
  public int quantity;
  
  public double calcCost() {
    return unitPrice * quantity;
  }
  
  public String toString() {
    return "Item{" +
            "itemName='" + itemName + '\'' +
            ", unitPrice=" + unitPrice +
            ", quantity=" + quantity +
            ", TOTAL PRICE = " + calcCost() +
            '}';
  }
}
