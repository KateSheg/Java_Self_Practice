package day08.theory;

public class TextCleaner {
  public static void main(String[] args) {
    String s = " \n \t\t \t\tC17o86d34e64 7i45s1 45p45o15e86tr13y12! \t\t ";
    s = s.replace("\n", "");
    s = s.replace("\t", "");
    for (int i = 0; i <= 9; i++) s = s.replace("" + i, "");
    s = s.trim();
    System.out.println(s);
  }
}
