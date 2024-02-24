package day16.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class RemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
    System.out.println(a);
    
    ArrayList<Integer> b = new ArrayList<>();
    for (Integer each: a) {
      if (!b.contains(each)) b.add(each);
    }
    
    Collections.sort(b);
    System.out.println(b);
//    for (Integer each: b)
//    System.out.println(each.toString());
  }
}
