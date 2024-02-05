package day10.theory;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;


public class ShoppingList {
  public static void main(String[] args) {
    ArrayList<String> shopList = new ArrayList<>(Arrays.asList("Milk","Eggs","Bread","Coffee","Tomato","Butter","Sugar","Water"));
    System.out.println(shopList);
    System.out.println("Number of items in the list: "+shopList.size());
    if (!shopList.isEmpty()) System.out.println("It's not empty "+shopList);
    else System.out.println("Empty list!!!");
    if (shopList.size()>=3) System.out.println("#2 = "+shopList.get(2));
    shopList.set(shopList.indexOf("Bread"),"Whole Wheat Bread");
    System.out.println(shopList);
    shopList.remove(3);
    System.out.println(shopList);
    System.out.println("Contains \"Cheese\" = " + shopList.contains("Cheese"));
    Collections.sort(shopList);
    System.out.println(shopList);
    ArrayList<String> shopList2 = new ArrayList<String>(100);
    for (int i=0; i<20; i++) {
      shopList2.add("q");
    }
    Collections.fill(shopList2,"X");
    System.out.println(shopList2);
    Collections.replaceAll(shopList2,"X","Bread");
    System.out.println("after replacing \"X\" to \"Bread\": "+shopList2);
    System.out.println("Frequency of \"Bread\" = "+Collections.frequency(shopList2,"Bread"));
  }
}
