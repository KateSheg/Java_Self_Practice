package day05.theory;

public class FibonacciSeries {
  public static void main(String[] args) {
    rowFibonacci(8);
  }
  
  public static void rowFibonacci(int n) {
    int a = 0;
    int b = 1;
    int c = a + b;
    String s = a + " " +  b + " " + c + " ";
    for (int i = 4; i <= n; i++) {
      a = b;
      b = c;
      c = a + b;
      s = s + c + " ";
    }
    System.out.println(s);
  }
}
