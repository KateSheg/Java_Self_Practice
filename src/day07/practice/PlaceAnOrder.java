package day07.practice;

import java.util.Scanner;

public class PlaceAnOrder {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Order o1 = new Order();
    System.out.print("Enter the product name: ");
    o1.productName = kb.nextLine();
    System.out.print("Enter the price: ");
    o1.price = kb.nextDouble();
    kb.nextLine();
    System.out.print("Enter the quantity: ");
    o1.quantity = kb.nextInt();
    kb.nextLine();
    System.out.print("Enter your first name: ");
    o1.firstName = kb.nextLine();
    kb.close();
    System.out.println(o1);
  }
  
  
}


