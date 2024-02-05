package day05.practice;

public class Task2_EnglishAlphabets {
  public static void main(String[] args) {
    row('A','Z');
  }
  
  public static void row(char a1, char a2) {
    int i1 = (int) a1;
    int i2 = (int) a2;
    String s = "";
    for (int i = i1; i <= i2; i++) {
      s += (char) i + " ";
    }
    System.out.println(s);
  }
}
