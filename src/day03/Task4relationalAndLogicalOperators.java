package day03;

public class Task4relationalAndLogicalOperators {
  public static void main(String[] args) {
    double a = 20.0;
    double b = 80.0;
    double c = (++a + ++b) * 25;
    System.out.println("Result " + c);
    System.out.println("Rest " + c % 40);
    if (c % 40 <= 20) {
      System.out.println("< 20 -- yes");
    }
    else System.out.println("< 20 -- no");
    
  }
}
