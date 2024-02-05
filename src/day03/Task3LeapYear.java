package day03;

public class Task3LeapYear {
  
  public static boolean isLeapYear(int year) {
    return year % 4 == 0 & year % 100 != 0 | year % 400 == 0;
  }
  
  public static void main(String[] args) {
    
    int Year = 1900;
    if (isLeapYear(Year)) { //& Year % 100 != 0 & Year % 400 == 0) {
      System.out.println("Yes");
    }
    else System.out.printf("No");
  }
}
