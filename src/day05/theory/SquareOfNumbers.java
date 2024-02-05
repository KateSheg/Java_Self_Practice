package day05.theory;

public class SquareOfNumbers {
  public static void main(String[] args) {
    tableOfSquareOfNumbers(1,10);
  }
  
  public static void tableOfSquareOfNumbers(int startI, int stopI) {
    System.out.println("Number\t|\tSquare of Number\n----------------------------");
    for (int i = startI; i <= stopI; i++) {
      System.out.println("\t" + i +"\t|\t" + i * i);
    }
  }
}
