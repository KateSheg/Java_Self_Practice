package day05.theory;

public class EvenNumbers {
  public static void main(String[] args) {
    task01(0,10);
  }
  
  public static void task01 (int startI, int finishI) {
    System.out.println("From " + startI + " to " + finishI + " inclusive, even numbers");
    for (int i = startI; i <= finishI; i++) {
      if (i % 2 == 0) System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
  }
}
