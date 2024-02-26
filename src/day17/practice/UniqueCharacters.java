package day17.practice;

import java.util.*;

public class UniqueCharacters {
  public static void main(String[] args) {
    String s = "aabcccdeeeef";
    Collection<String> list = new ArrayList<>(Arrays.asList(s.split("")));
    System.out.println(list);
    Map<String,Integer> map = new LinkedHashMap<>();
    for (String each: list) {
      if (Collections.frequency(list,each)==1) map.putIfAbsent(each, 1);
      
    }
    System.out.println(map);
  }
}
