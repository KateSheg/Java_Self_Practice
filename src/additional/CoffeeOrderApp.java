package additional;

import java.util.Scanner;

public class CoffeeOrderApp {
  public static void main(String[] args) {
    int blackCoffeePrice = 3;
    int lattePrice = 5;
    int cappuccinoPrice = 6;
    int totalPrice = 0;
    String startOrder = "";
    Scanner kb = new Scanner(System.in);
    System.out.println("Welcome to the Coffee Order App!");
    boolean needToAsk = true;
    
    while (needToAsk) {
      if (totalPrice==0) System.out.print("\nWould you like to order coffee? ");
      else System.out.print("\nould you like more coffee? ");
      startOrder = kb.next();
      switch (startOrder.toLowerCase()) {
        case "yes" -> {
          totalPrice += step2(blackCoffeePrice,lattePrice,cappuccinoPrice);
          //System.exit(0);
        }
        case "no" -> {
          if (totalPrice>0) System.out.println("\nYour total is: $" + totalPrice);
          System.out.println("Thanks for using our service!");
          needToAsk=false;
          System.exit(0);
        }
        default -> {
          System.out.println("\nPlease, re-enter");
          needToAsk=true;
        }
      }
    }
  }
  
  public static int step2(int blackCoffeePrice, int lattePrice, int cappuccinoPrice) {
    int total = 0;
    System.out.println("\n1. Black Coffee - $" + blackCoffeePrice);
    System.out.println("2. Latte - $" + lattePrice);
    System.out.println("3. Cappuccino - $" + cappuccinoPrice);
    Scanner kb = new Scanner(System.in);
    boolean needToChooseCoffee = true;
    
    while (needToChooseCoffee) {
      System.out.print("\nPick a coffee: ");
      String option = kb.next();
      switch (option) {
        case "1" -> {
          System.out.println("Added Black Coffee to Your order.");
          total += blackCoffeePrice;
          needToChooseCoffee = false;
        }
        case "2" -> {
          System.out.println("Added Latte to Your order.");
          total += lattePrice;
          needToChooseCoffee = false;
        }
        case "3" -> {
          System.out.println("Added Cappuccino to Your order.");
          total += cappuccinoPrice;
          needToChooseCoffee = false;
        }
        default -> System.out.println("Please, re-enter.");
      }
    }
    return total;
  }
}
