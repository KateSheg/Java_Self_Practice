package day05.practice;

public class Task1_Rectangle {
  public static void main(String[] args) {
    drawRectangle(9,8);
  }
  
  public static void drawRectangle(int ii, int jj) {
    String s = "";
    for (int i = 1; i <= ii; i++) {
      s = "";
      for (int j = 1; j <= jj; j++) {
        s += " * ";
      }
      System.out.println(s);
    }
  }
}
