package day12.practice.item;

public class ItemClients {
  public static void main(String[] args) {
    Item i1 = new Item("Onion", 4.34, 5);
    System.out.println(i1);
    Item i2 = new Item();
    i2.setName("Banana");
    i2.setUnitPrice(-2.3);
    i2.setQuantity(4);
    System.out.println(i2);
  }
}
