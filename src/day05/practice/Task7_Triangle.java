package day05.practice;

public class Task7_Triangle {
  public static void main(String[] args) {
    drawTriangle(10);
  }
  
  public static void drawTriangle(int n) {
    String s = "";
    for (int i = 1; i <= n; i++) {
      s = "";
      for (int j = 1; j <= i; j++) {
        s += " * ";
      }
      System.out.println(s);
    }
  }
}
