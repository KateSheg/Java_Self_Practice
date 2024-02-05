package day09.practice;

public class GroceryItems {
  public static void main(String[] args) {
    String[][] items = {
            {"Apple", "Banana", "Grape", "Avocado"},
            {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
            {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
    };
    for (int i=0; i<items.length; i++) {
      for (int j=0; j<items[i].length; j++) {
        System.out.print(items[i][j] + "\t\t\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("-----------------------------------------");
    for (int i=0; i<items.length; i++) {
      for (int j=0; j<items[i].length; j++) {
        System.out.print(items[i][items[i].length-j-1] + "\t\t\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("-----------------------------------------");
    for (int i=0; i<items.length; i++) {
      for (int j=0; j<items[items.length-i-1].length; j++) {
        System.out.print(items[items.length-i-1][j] + "\t");
      }
      System.out.println();
    }
  }
}
