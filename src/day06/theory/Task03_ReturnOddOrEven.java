package day06.theory;

public class Task03_ReturnOddOrEven {
  public static void main(String[] args) {
    System.out.println(getOddOrEven(100));
    System.out.println(getOddOrEven(45));
  }
  
  public static String getOddOrEven(int n) {
    String s = n + " is ";
    s += (n % 2 == 0) ? "even" : "odd";
    s += " number";
    return s;
  }
  
}
