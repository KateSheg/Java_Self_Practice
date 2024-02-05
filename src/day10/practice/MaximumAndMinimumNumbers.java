package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimumNumbers {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    int min = 0;
    int max = 0;
    max = list.get(0);
    min = list.get(0);
    for (Integer l: list) {
      if (l>max) max=l;
      if (l<min) min=l;
    }
    System.out.println("Maximum number is "+max);
    System.out.println("Minimum number is "+min);
  }
}
