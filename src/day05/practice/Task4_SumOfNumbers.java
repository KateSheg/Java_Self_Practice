package day05.practice;

public class Task4_SumOfNumbers {
  public static void main(String[] args) {
    System.out.println("Sum from 1 to 100 is " + getSum(100));
    System.out.println("Sum from 1 to 50 is " + getSum(50));
  }
  
  public static int getSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
