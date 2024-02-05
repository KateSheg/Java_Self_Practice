package day04;

public class AgeGroups {
  public static void main(String[] args) {
    int age = 485;
    String s = "Invalid";
    if (age >= 0 & age <= 20) s = "Teenager ";
    else if (age >= 21 & age <= 55) s = "Adult";
    else if (age >= 56 & age <= 150) s = "Senior";
    System.out.println(s);
  }
}
