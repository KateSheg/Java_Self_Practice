package day09.practice;

public class ArrayElements {
  public static void main(String[] args) {
    int[] a1 = new int[100];
    for (int i=0; i<100; i++) {
      a1[i]=i;
      System.out.print(a1[i] + " ");
    }
    System.out.println();
    System.out.println("------------------------------------------------------");
    for (int i=0; i<100; i++) {
      a1[i]=100-i-1;
      System.out.print(a1[i] + " ");
    }
    System.out.println();
    System.out.println("------------------------------------------------------");
    for (int i=0; i<100; i++) {
      a1[i]=100-i-1;
      if (a1[i]%5==0) System.out.print(a1[i] + " ");
    }
  }
}
