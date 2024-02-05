package day04.practice;

public class Practice6Grade {
  public static void main(String[] args) {
    int n = 90; //75;
    if (n >= 0 & n < 60) {
      System.out.println("Fail");
    }
    else if (n >= 60 & n < 90) {
      System.out.println("Pass");
    }
    else if (n >= 90) {
      System.out.println("Passed with Distinction");
    }
    else if (n < 0 | n > 100) {
      System.out.println("Invalid score");
    }
  }
}
