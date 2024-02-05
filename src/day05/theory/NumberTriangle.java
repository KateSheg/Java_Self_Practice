package day05.theory;

public class NumberTriangle {
  public static void main(String[] args) {
    drawTriangle(5);
  }
  
  public static void drawTriangle(int n) {
    String s = "";
    for (int i = 1; i <= n; i++) {
      s = "";
      for (int j = 1; j <= i; j++) {
        s = s + " " + j;
      }
      System.out.println(s);
    }
  }
}
