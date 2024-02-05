package day03;

public class UnaryOperations {
  public static void main(String[] args) {
    int a = 10;
    a = --a + a++ + a-- + a++;
    System.out.println("Task is:\n\tint a = 10;\n\ta = --a + a++ + a-- + a++;\na = ???");
    System.out.println("Answer is:\n\ta = " + a);
    a = 10;
    System.out.println("\ta = " + a + ", --a = " + --a + ", a = " + a);
    System.out.println("\ta = " + a + ", a++ = " + a++ + ", a = " + a);
    System.out.println("\ta = " + a + ", a-- = " + a-- + ", a = " + a);
    System.out.println("\ta = " + a + ", a++ = " + a++ + ", a = " + a);
  }
}
