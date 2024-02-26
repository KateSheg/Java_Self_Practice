package day17.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultiplyOdds {
  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('a',1);
    map.put('b',2);
    map.put('c',3);
    map.put('d',4);
    map.put('e',5);
    System.out.println(map);
    
    Iterator<Character> itr = map.keySet().iterator();
    
    while(itr.hasNext()){
      Character key = itr.next();
      System.out.println(key + " " + map.get(key));
      if(map.get(key)%2!=0){
        map.replace(key,map.get(key)*2);
      }
    }
    
    System.out.println(map);  }
}
