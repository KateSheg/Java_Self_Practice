package day04;

public class WeeklyWage {
  public static void main(String[] args) {
    int hours = 47;
    double salaryRate;
    int limitForHours = 40;
    double wage;
    salaryRate = 900.0 / limitForHours;
    System.out.println("Saalary rate is " + salaryRate);
    if (hours > limitForHours) {
      wage = salaryRate * limitForHours + salaryRate * 1.5 * (hours - limitForHours);
    }
    else wage = salaryRate * hours;
    
    System.out.println("Weekly wage is " + wage);
  }
  
  
  
}
