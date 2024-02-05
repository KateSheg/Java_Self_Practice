package day05.theory;

public class SquarePattern {
  public static void main(String[] args) {
    drawSnowflakes(6);
  }
  
  public static void drawSnowflakes(int n) {
    String s = "";
    for (int i = 1; i <= n; i++) {
      s = s + " * ";
    }
    for (int i = 1; i <= n; i++) {
      System.out.println(s);
    }
  }
}
