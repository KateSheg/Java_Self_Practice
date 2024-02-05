package day06.theory;

public class Task01_OddOrEven {
  public static void main(String[] args) {
    getOddOrEven(100);
    getOddOrEven(45);
  }
  
  public static void getOddOrEven(int n) {
    String s = "";
    System.out.println(s = (n % 2 == 0) ? n + " is even number": n + " is odd number");
  }
}
