package day17.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
  public static void main(String[] args) {
    String s = "bbcccaaaaa";
    Map<Character,Integer> map = new LinkedHashMap<>();
    for (int i=0; i<s.length(); i++) {
      map.putIfAbsent(s.charAt(i), 0);
      map.put(s.charAt(i),map.get(s.charAt(i))+1);
    }
    System.out.println(map);
  }
}
