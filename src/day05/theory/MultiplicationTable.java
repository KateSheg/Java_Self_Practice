package day05.theory;

public class MultiplicationTable {
  public static void main(String[] args) {
    tableMultiplication(10);
  }
  
  public static void tableMultiplication(int i) {
    System.out.println("Multiplication table for " + i + "\n---------------------------");
    for (int j = 1; j <= 10; j++) {
      System.out.println("\t" + i + " x " + j + "\t= " + i * j);
    }
  }
}
