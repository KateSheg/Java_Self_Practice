package day06.practice;

public class Task1_OddAndEven {
  public static void main(String[] args) {
    System.out.println(isOdd(100));
    System.out.println(isEven(100));
  }
  
  public static boolean isOdd(int n) {
    return n % 2 != 0;
  }
  
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
}
