package day11.theory;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfFirstThreeElements {
  public int[] b;
  public ArrayList<Integer> f;
  public int n;
  
//  {
//    n = b.length;
//  }
  
  public SumOfFirstThreeElements(int[] b) {
    this.b = b;
//    for (int i=0; i<b.length; i++) {
//      System.out.println(b[i]);
//    }
  }
  
  public int sum3Min() {
    n = b.length;
    ArrayList<Integer> d = new ArrayList<>();
    for (int i=0; i<n; i++) d.add(b[i]);
    int max = Collections.max(d);
    int sum = 0;
    for (int i=1; i<=3; i++) {
      int min = Collections.min(d);
      sum += min;
      int indexMin = d.indexOf(min);
      d.set(indexMin, max);
    }
    return sum;
  }
  
  public static void main(String[] args) {
    //int[] a = {8, 3, 5, 2, 10, 4};
    int[] a = {12, 6, 7, 2, 10, 5};
    SumOfFirstThreeElements e = new SumOfFirstThreeElements(a);
    System.out.println("\nsum = " + e.sum3Min());
  }
}
