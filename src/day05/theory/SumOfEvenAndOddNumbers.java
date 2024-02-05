package day05.theory;

public class SumOfEvenAndOddNumbers {
  public static void main(String[] args) {
    System.out.println("Sum of even number = " + sumEven(1,100));
    System.out.println("Sum of odd number = " + sumOdd(2,100));
  }
  
  public static int sumEven(int startI, int stopI) {
    int sum = 0;
    for (int i = startI + 1; i < stopI; i++) {
      if (i % 2 == 0) sum = sum + i;
    }
    return sum;
  }
  
  public static int sumOdd(int startI, int stopI) {
    int sum = 0;
    for (int i = startI + 1; i < stopI; i++) {
      if (i % 2 != 0) sum = sum + i;
    }
    return sum;
  }
}
