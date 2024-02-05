package day05.theory;

public class WhileLoop {
  public static void main(String[] args) {
    rowOfNaturalNumbers(0,10);
  }
  
  public static void rowOfNaturalNumbers(int startI, int stopI) {
    int i = startI;
    String s = "";
    while (i <= stopI) {
      s += i++ + " ";
    }
    System.out.println(s);
  }
}
