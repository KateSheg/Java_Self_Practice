package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
    ArrayList<Integer> list2 = new ArrayList<>();
    System.out.println("before: "+list);
    int f = 0;
    int l = list.size();
    list2.add(list.get(0));
    //ArrayList.removeIf(i->(Collections.frequency(list,i)>1));
    for (int i=1; i<l; i++) {
      f = 0;
      for (int j=0; j<i; j++) {
        if (list.get(i).equals(list.get(j))) f=1;
      }
      if (f==0) list2.add(list.get(i));
    }
    System.out.println("after: "+list2);
  }
}
