package day03;

public class AndOrOperators {
  public static void main(String[] args) {
    int num = 0;
    System.out.println((num < 1) & (num == 0)); // true & true -> true
    System.out.println((num < 1) && (num == 0)); // true && true -> true
    System.out.println((num == 0) && (num > 2)); // true && false -> false
    System.out.println();
    System.out.println((num == 2) & (num > 1)); // false & false -> false
    System.out.println((num > 1) && (num == 0)); // false && --- -> false
    System.out.println((num == 2) && (num > 1)); // false && --- -> false
  }
}
