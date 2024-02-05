package day05.theory;

public class OddNumbers {
  public static void main(String[] args) {
    task01(1,19);
  }
  
  public static void task01(int startI, int stopI) {
    System.out.println("From " + startI + " to " + stopI + " inclusive, odd numbers, dash");
    for (int i = startI; i <= stopI; i = i +2) {
      System.out.print(i);
      if (i <= stopI - 1) System.out.print("-");
    }
    System.out.println();
    System.out.println();
  }
}
