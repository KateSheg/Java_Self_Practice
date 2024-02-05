package day10.practice;

import java.util.Arrays;

public class CombineTwoArrays {
  public static void main(String[] args) {
    String[] arr1 = {"A", "B", "C"};
    String[] arr2 = {"D", "E", "F", "G"};
    String[] arr3 = new String[arr1.length+arr2.length];
    System.out.println("arr1: "+Arrays.toString(arr1));
    System.out.println("arr2: "+Arrays.toString(arr2));
    for (int i=0; i<=arr1.length+-1; i++) {
      arr3[i] = arr1[i];
    }
    for (int i=0; i<=arr2.length+-1; i++) {
      arr3[i+arr1.length] = arr2[i];
    }
    System.out.println("arr3: "+Arrays.toString(arr3));
  }
}
