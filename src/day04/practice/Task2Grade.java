package day04.practice;

public class Task2Grade {
  public static void main(String[] args) {
    int Math = 50;
    int Chemistry = 60;
    int Biology = 70;
    double a = (Math + Chemistry + Biology) / 3;
    if (a >= 90 & a <= 100) {
      System.out.println("Average is " + a + "\nGrade is A");
    }
    else if (a >= 80 & a <= 89) {
      System.out.println("Average is " + a + "\nGrade is B");
    }
    else if (a >= 70 & a <= 79) {
      System.out.println("Average is " + a + "\nGrade is C");
    }
    else if (a >= 60 & a <= 69) {
      System.out.println("Average is " + a + "\nGrade is D");
    }
    else if (a >= 0 & a <= 59) {
      System.out.println("Average is " + a + "\nGrade is F");
    }
  }
}
