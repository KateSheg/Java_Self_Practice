package day04.practice;

public class Practice1Calculator {
  public static void main(String[] args) {
    int a, b;
    a = 120;
    b = 7;
    float c = 0.1f;
    String s = "div";
    switch (s) {
      case "+": {
        c = a + b;
        System.out.println(c);
        break;
      }
      case "-": {
        c = a - b;
        System.out.println(c);
        break;
      }
      case "*": {
        c = a * b;
        System.out.println(c);
        break;
      }
      case "div": {
        c = a / b;
        System.out.println(c);
        break;
      }
      default:
        System.out.println("Invalid operator");
    }
    
  }
}
