package day16.theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VoidMethodCahngingVariable {
  
  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.addAll(Arrays.asList("apple", "orange", "banana", "apple", null, "grape", "banana", null, "apple", "grape", "banana"));
//    int[] b;
//    System.out.println(b[0]);
    removeDuplicates(list);
    
    System.out.println("list = " + list);


        /*
        List<String> uniqueList = new ArrayList<>();

        for (String each : list) {
            if(uniqueList.contains(each)){
                continue;
            }
            uniqueList.add(each);
        }

        System.out.println("uniqueList = " + uniqueList);
         */
    
    Integer ii=3;
    test(ii);
    System.out.println(ii);
    
  }
  
  public static void test(Integer i) {
    i = 2;
  }
  
  
  
  public static void removeDuplicates(List<String> list) {
    
    List<String> uniqueList = new ArrayList<>();
    
    for (String each : list) {
      if (uniqueList.contains(each)) {
        continue;
      }
      uniqueList.add(each);
    }
    
    list.clear();
    list.addAll(uniqueList);
    
  }
  
}

