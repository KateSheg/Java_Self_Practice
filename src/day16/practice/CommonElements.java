package day16.practice;

import java.util.*;

public class CommonElements {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));
    Set<Integer> set2 = new HashSet<>();
    set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
    Set<Integer> set3 = new LinkedHashSet<>();
    
    for (Integer each: set1)
      if (set2.contains(each) && !set3.contains(each)) set3.add(each);
//    for (Integer each: set2)
//      if (set1.contains(each) && !set3.contains(each)) set3.add(each);
    //Set.sort(set3);
    System.out.println(set3);
  }
}
