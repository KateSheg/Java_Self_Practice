package day05.theory;

public class PrintNumbers {
  public static void main(String[] args) {
    task01(0,10);
    task01(5,20);
    task02(20,10);
    task03(10,100);
    task04(50,10);
    task05(5);
  }
  
  public static void task01(int startI, int finishI) {
    System.out.println("From " + startI + " to " + finishI + " inclusive, step = 1");
    for (int i = startI; i <= finishI; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
  }
  
  public static void task02(int startI, int finishI) {
    System.out.println("From " + startI + " to " + finishI + " exclusive, step = -1");
    for (int i = startI - 1; i >= finishI + 1; i--) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
  }
  
  public static void task03(int startI, int finishI) {
    System.out.println("From " + startI + " to " + finishI + " inclusive, step = 10");
    for (int i = startI; i <= finishI; i=i+10) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
  }
  
  public static void task04(int startI, int finishI) {
    System.out.println("From " + startI + " to " + finishI + " exclusive, step = -4");
    for (int i = startI - 1; i >= finishI + 1; i = i - 4) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
  }
  
  public static void task05(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.print("Hello ");
    }
    System.out.println();
    System.out.println();
  }
  
}
