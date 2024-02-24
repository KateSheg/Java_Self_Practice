package day16.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DifferenceBetweenTwoSets {
  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    set1.addAll(Arrays.asList(1, 2, 3, 5));
    Set<Integer> set2 = new HashSet<>();
    set2.addAll(Arrays.asList(2, 3, 4));
    Set<Integer> set3 = new LinkedHashSet<>();
    for (Integer each: set1)
      if (!set2.contains(each) && !set3.contains(each)) set3.add(each);
    
    System.out.println(set3);
  }
}
