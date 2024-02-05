package day04;

public class MedianNumber {
  public static void main(String[] args) {
    int a = 10;
    int b = 10;
    int c = 20;
    double d = 0;
    if (a != b & b != c) {
      d = (a + b + c) / 3;
      System.out.println(d + " is the median number");
    }
    else System.out.println("Enter DIFFERENT numbers");
  }
}
