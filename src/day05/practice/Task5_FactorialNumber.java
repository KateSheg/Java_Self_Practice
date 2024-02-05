package day05.practice;

public class Task5_FactorialNumber {
  public static void main(String[] args) {
    System.out.println(getFactorial(5));
  }
  
  public static int getFactorial(int n) {
    int mult = 1;
    for (int i = 1; i <= n; i++) {
      mult *= i;
    }
    return mult;
  }
}
