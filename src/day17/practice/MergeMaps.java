package day17.practice;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
  public static void main(String[] args) {
    Map<Character,Integer> map1 = new HashMap<>();
    map1.put('A',10);
    map1.put('B',20);
    System.out.println(map1);
    
    Map<Character,Integer> map2 = new HashMap<>();
    map2.put('B',30);
    map2.put('C',40);
    System.out.println(map2);
    
    for (Map.Entry<Character,Integer> each2: map2.entrySet()) {
      if (map1.containsKey(each2.getKey())) map1.put(each2.getKey(),map1.get(each2.getKey())+each2.getValue());
      else map1.put(each2.getKey(),each2.getValue());
    }
    System.out.println(map1);
  }
}
