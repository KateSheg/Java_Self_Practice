package day04;

public class OxygenTank {
  public static void main(String[] args) {
    int level = 76;
    String result = (level >= 90) ? "Your tank is full" : (level >= 80) ? "Still okay" : (level >= 70) ? "Don't go too far" : (level >= 60) ? "Start to head back" : (level >= 50) ? "Be careful, you're at 50%" : "";
    System.out.println(result);
  }
}
