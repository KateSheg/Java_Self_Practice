package day04.practice;

public class Task1GreetingHours {
  public static void main(String[] args) {
    int hours = 14;
    if (hours >= 6 & hours < 12) {
      System.out.println("Good Morning");
    }
    else if (hours >= 12 & hours < 15) {
      System.out.println("Good Afternoon");
    }
    else if (hours >= 15 & hours < 22) {
      System.out.println("Good Evening");
    }
    else if (hours <0 | hours > 23) {
      System.out.println("This is not a valid hour");
    }
  }
}
