package day06.practice;

public class Task2_SalaryCalculator {
  public static void main(String[] args) {
    System.out.println(salary(45,40));
  }
  
  public static double salary(double rate, int hours) {
    return rate * hours * 52;
  }
}
