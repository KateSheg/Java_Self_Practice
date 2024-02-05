package day09.practice;

public class EvenOddNumbers {
  public static void main(String[] args) {
    int[] a = {20, 34, 93, 1, 20, 90, 24, 74, 21};
    int numberOfEven = 0;
    int numberOfOdd = 0;
    for (int i=0; i<a.length; i++) {
      if (a[i]%2==0) numberOfEven++;
      else numberOfOdd++;
    }
    System.out.println("The array has " + numberOfOdd + " odd numbers and " + numberOfEven + " even numbers.");
  }
}
