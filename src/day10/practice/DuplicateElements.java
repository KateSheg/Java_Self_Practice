package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateElements {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    ArrayList<Integer> list2 = new ArrayList<>();
//    Collections.copy(list2,list);
    System.out.println("list = "+list);
    //System.out.println(list2);
    for (int i=1; i<=2; i++) {
      for (Integer j : list) {
        list2.add(j);
      }
    }
    System.out.println("list2 = "+list2);
  }
}
