package day06.practice;

public class Task5_MathUtility {
  public static void main(String[] args) {
    System.out.println(calculate(10,'/',20));
    System.out.println(calculate(2.5,'*',3));
    System.out.println(square(8));
    System.out.println(square(1.5));
    System.out.println(cube(3));
    System.out.println(cube(2.5));
  }
  
  public static int calculate(int a, char operation, int b) {
    int c = 0;
    switch (operation) {
      case '+': {c = a + b; break;}
      case '-': {c = a - b; break;}
      case '*': {c = a * b; break;}
      case '/': {c = a / b; break;}
      default: {c = 0; break;}
    }
    return c;
  }
  
  public static double calculate(double a, char operation, double b) {
    double c = 0;
    switch (operation) {
      case '+': {c = a + b; break;}
      case '-': {c = a - b; break;}
      case '*': {c = a * b; break;}
      case '/': {c = a / b; break;}
      default: {c = 0; break;}
    }
    return c;
  }
  
  public static int square(int n) {
    return calculate(n,'*',n);
  }
  
  public static double square(double n) {
    return calculate(n,'*',n);
  }
  
  public static int cube(int n) {
    return calculate(calculate(n,'*',n),'*',n);
  }
  
  public static double cube(double n) {
    return calculate(calculate(n,'*',n),'*',n);
  }
}
