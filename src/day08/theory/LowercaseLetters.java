package day08.theory;

public class LowercaseLetters {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    char c;
    for (int i=97; i<=122; i++) {
      c = (char) i;
      sb.append(c);
      sb.append(" ");
    }
    System.out.println(sb.toString());
    
  }
}
