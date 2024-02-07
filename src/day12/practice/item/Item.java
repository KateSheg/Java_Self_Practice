package day12.practice.item;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Item {
  private String name;
  private double unitPrice;
  private int quantity;
  
  public Item() {
  }
  
  public Item(String name) {
    this.name = name;
  }
  
  public Item(String name, double unitPrice) {
    this(name);
    this.unitPrice = unitPrice;
  }
  
  public Item(double unitPrice) {
    this.unitPrice = unitPrice;
  }
  
  public Item(String name, double unitPrice, int quantity) {
    this(name, unitPrice);
    this.quantity = quantity;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    if (!name.isBlank() && !name.isEmpty()) {
      String[] original = name.split("");
      ArrayList<String> originalList = new ArrayList<String>(Arrays.asList(original));
      boolean f = false;
      if (!Character.isLetter(name.charAt(0))) f = true;
      else {
        for (String s : originalList) {
          if (!Character.isLetterOrDigit(s.charAt(0))) f = true;
        }
      }
      if (f) {
        System.err.println("Incorrent name!");
        System.exit(1);
      } else this.name = name;
    }
  }
  
  public double getUnitPrice() {
    return unitPrice;
  }
  
  public void setUnitPrice(double unitPrice) {
    if (unitPrice >= 0) this.unitPrice = unitPrice;
    else {
      System.err.println("Incorrect value of unitPrice!");
      System.exit(1);
    }
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public void setQuantity(int quantity) {
    if (quantity>=0) this.quantity = quantity;
    else {
      System.err.println("Incorrect value of quantity!");
      System.exit(1);
    }
  }
  
  public double calcCost() {
    return unitPrice*quantity;
  }
  
  public String toString() {
    DecimalFormat f = new DecimalFormat("##.00");
    return "\t" + name + ": $" + f.format(calcCost()) +
            " = price $" + unitPrice + " * quantity " + quantity ;
  }

}
