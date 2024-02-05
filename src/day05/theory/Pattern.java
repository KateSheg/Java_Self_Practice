package day05.theory;

public class Pattern {
  public static void main(String[] args) {
    drawBankOfSnow(7);
  }
  
  public static void drawBankOfSnow(int n) {
    String s = "";
    for (int i = 1; i <= n; i++) {
      s = "#";
      for (int j = 1; j <= i - 1; j++) {
        s = s + " ";
      }
      s = s + "#";
      System.out.println(s);
    }
    
  }
}
