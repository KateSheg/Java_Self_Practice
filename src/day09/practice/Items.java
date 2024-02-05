package day09.practice;

public class Items {
  public static void main(String[] args) {
    String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
    double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
    int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
    boolean isContained = false;
    for (int i=0; i<items.length; i++) {
      if (items[i]=="Gloves") System.out.println("The first index number of \"Gloves\" is " + i);
      if (items[i]=="iPad") isContained = true;
    }
    System.out.println("iPad is contained = " + isContained);
    System.out.println("------------------------------------------------");
    for (int i=0; i<items.length; i++) {
      System.out.println(items[i] + " - " + prices[i] + " - #" + itemIDs[i]);
    }
    
  }
}
