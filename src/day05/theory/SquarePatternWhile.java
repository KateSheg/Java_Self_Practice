package day05.theory;

public class SquarePatternWhile {
  public static void main(String[] args) {
    drawSnowCube(6);
  }
  
  public static void drawSnowCube(int n) {
    int i = 1;
    int j = 1;
    String s = "";
    while (j <= n) {
      s = "";
      i = 1;
      while (i <= n) {
        s = s + " * ";
        i = i + 1;
      }
      j = j + 1;
      System.out.println(s);
    }
    
  }
}
