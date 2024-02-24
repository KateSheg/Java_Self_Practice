package day16.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeList {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));
    list1.addAll(list2);
    System.out.println(list1);
    ArrayList<Integer> list3 = new ArrayList<>();
    for (Integer each: list1)
      if (!list3.contains(each)) list3.add(each);
    Collections.sort(list3);
    System.out.println(list3);
  }
}
