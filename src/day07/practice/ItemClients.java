package day07.practice;

public class ItemClients {
  public static void main(String[] args) {
    Item i1 = new Item();
    i1.itemName = "carrot";
    i1.unitPrice = 2.8;
    i1.quantity = 7;
    System.out.println("If we buy " + i1.quantity + "lb by $" + i1.unitPrice + " of " + i1.itemName);
    System.out.println("we will pay $" + i1.calcCost());
    System.out.println(i1);
  }
}
