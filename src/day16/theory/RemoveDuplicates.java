package day16.theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
  public static void main(String[] args) {
    List<String> a = new ArrayList<>(Arrays.asList("apple", "orange", "banana", "apple",
            null, "grape", "banana", null));
    a.add("KIWI");
    System.out.println(a);
    
    List<String> b = new ArrayList<>();
    for (String each: a) {
      if (!b.contains(each)) b.add(each);
    }
    System.out.println(b);
  }
}
