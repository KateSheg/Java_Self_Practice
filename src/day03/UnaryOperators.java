package day03;

public class UnaryOperators {
  public static void main(String[] args) {
    int x = 4;
    int y = --x * 4 - x++;
    System.out.println("Task is:\n\tint x = 4;\n\tint y = = --x * 4 - x++;\nx = ???\ny = ???");
    System.out.println("Answer is:\n\tx = " + x + "\n\ty = " + y);
    System.out.println();
    
    int a = 1;
    a = a++ + a++ / --a * --a;
    System.out.println("Task is:\n\tint a = 1;\n\ta = a++ + a++ / --a * --a;\na = ???");
    System.out.println("Answer is:\n\ta = " + a);
  }
}
