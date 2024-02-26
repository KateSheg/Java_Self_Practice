package day17.practice;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1,"a");
    map.put(2,"b");
    map.put(3,"c");
    
    System.out.println(map);
    
    Map<String, Integer> map2 = new HashMap<>();
    for (Map.Entry<Integer,String> each : map.entrySet()) {
      map2.put(each.getValue(),each.getKey());
    }
    
    System.out.println(map2);
  }
}
