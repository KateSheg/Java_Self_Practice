package day04;

public class Grade5 {
  public static void main(String[] args) {
    String Grade = "1";
    switch (Grade) {
      case "A": {
        System.out.println("Excellent");
        break;
      }
      case "B": {
        System.out.println("Great job");
        break;
      }
      case "C": {
        System.out.println("Good");
        break;
      }
      case "D": {
        System.out.println("Passed");
        break;
      }
      case "F": {
        System.out.println("Failed");
        break;
      }
      default: {
        System.out.println("Invalid number");
        break;
      }
      
    }
  }
}
