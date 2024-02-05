package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeroes {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
    System.out.println("list: "+list);
    int n = list.size();
    for (int i=0; i<=n-1; i++) {
      for (int j=i; j<=n-1; j++) {
        if (list.get(i)==0 && list.get(j)!=0) {
          list.set(i,list.get(j));
          list.set(j,0);
        }
      }
    }
    System.out.println(list);
  }
}
