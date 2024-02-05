package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
    ArrayList<Integer> list2 = new ArrayList<>();
    for (Integer l: list) {
      if (Collections.frequency(list,l)==1) list2.add(l);
    }
    System.out.println("list: "+list);
    System.out.println("list2: "+list2);
  }
}
