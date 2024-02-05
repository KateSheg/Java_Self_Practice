package day05.practice;

public class Task8_Alphabets {
  public static void main(String[] args) {
    getDoubleAlphabets('A', 'Z', 'a', 'z');
  }
  
  public static void getDoubleAlphabets(char i1, char i2, char j1, char j2) {
    String s = "";
    for (int i = (int) i1; i <= (int) i2; i++) {
      s = "";
      for (int j = (int) j1; j <= (int) j2; j++) {
        s += (char) i + "" + (char) j + " ";
      }
      System.out.println(s);
    }
  }
}
