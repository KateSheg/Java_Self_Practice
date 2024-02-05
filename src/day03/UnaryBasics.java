package day03;

public class UnaryBasics {
  
  public static void main(String[] args) {
    int x = 2;
    int y = x++;
    System.out.println("1) Task is:\nint x = 2;\nint y = x++;\n1) y = ???");
    System.out.println("1) Answer is:");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println();
    
    x = 2;
    System.out.println("2) Task is:\nint x = 2;\n2) x++ = ???");
    System.out.println("2) Answer is:");
    System.out.println("x = " + x);
    System.out.println("x++ = " + x++);
    System.out.println();
    
    x = 2;
    System.out.println("3) Task is:\nint x = 2;\n3) --x = ???");
    System.out.println("3) Answer is:");
    System.out.println("--x = " + --x);
    System.out.println();
    
    x = 8;
    y = x--;
    System.out.println("4) Task is:\nint x = 8;\nint y = x--;\n4) y = ???");
    System.out.println("4) Answer is:");
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println();
  }
}
