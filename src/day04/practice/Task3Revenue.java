package day04.practice;

public class Task3Revenue {
  public static void main(String[] args) {
    double price = 1500 ; //119.99;
    int quantity = 4; //10;
    double revenue = price * quantity;
    double discount = 0.1 * revenue;
    if (revenue < 5000) {
      System.out.println("Revenue:\t" + revenue);
    }
    else {
      revenue = revenue - discount;
      System.out.println("Discount:\t" + discount + "\nRevenue:\t" + revenue);
    }
  }
}
