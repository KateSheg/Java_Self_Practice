package day11.practice;

public class Pizza {
  public String size;
  public int numberOfCheeseTopping, numberOfPepperoniTopping;
  
  public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
    this.size = size;
    this.numberOfCheeseTopping = numberOfCheeseTopping;
    this.numberOfPepperoniTopping = numberOfPepperoniTopping;
  }
  
  public int calcCost() {
    int sum = 0;
    switch (size) {
      case "Small" -> sum = 10;
      case "Medium" -> sum = 12;
      case "Large" -> sum = 14;
    }
    sum += 2*this.numberOfPepperoniTopping + 2*this.numberOfCheeseTopping;
    return sum;
  }
  
  @Override
  public String toString() {
    return "\nPizza of " + size +" size with " + numberOfCheeseTopping +
            " cheese toppings and " + numberOfPepperoniTopping + " pepperoni toppings" +
            "\nTotal cost $" + calcCost();
  }
  
  public static void main(String[] args) {
    Pizza p1 = new Pizza("Small",1,2);
    System.out.println(p1);
    Pizza p2 = new Pizza("Large",2,3);
    System.out.println(p2);
    Pizza p3 = new Pizza("Medium",1,1);
    System.out.println(p3);
    
  }
}
