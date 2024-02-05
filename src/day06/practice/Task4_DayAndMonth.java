package day06.practice;

import day03.Task3LeapYear;

import java.util.Calendar;

import static day04.MonthName.monthName2;

public class Task4_DayAndMonth {
  public static void main(String[] args) {
    System.out.println(day(5));
    System.out.println(monthName(6));
    System.out.println(monthName(6) + " has " + daysInMonth(6) + " days");
  }
  
  public static String day(int n) {
    String s = "";
    switch (n) {
      case 1: {s = "Monday"; break; }
      case 2: {s = "Tuesday"; break; }
      case 3: {s = "Wednesday"; break; }
      case 4: {s = "Thurthday"; break; }
      case 5: {s = "Friday"; break; }
      case 6: {s = "Saturday"; break; }
      case 7: {s = "Sunday"; break; }
      default: {s = "Invalid Number"; break; }
    }
    return s;
  }
  
  public static String monthName(int n) {
    String s = "";
    switch (n) {
      case 1: {
        s = "January";
        break;
      }
      case 2: {
        s = "February";
        break;
      }
      case 3: {
        s = "March";
        break;
      }
      case 4: {
        s = "April";
        break;
      }
      case 5: {
        s = "May";
        break;
      }
      case 6: {
        s = "June";
        break;
      }
      case 7: {
        s = "July";
        break;
      }
      case 8: {
        s = "August";
        break;
      }
      case 9: {
        s = "September";
        break;
      }
      case 10: {
        s = "October";
        break;
      }
      case 11: {
        s = "November";
        break;
      }
      case 12: {
        s = "December";
        break;
      }
      default: {
        s = "No such month";
        break;
      }
    }
    return s;
  }
  
 
  public static int daysInMonth(int i) {
    int c = 0;
    int nowYear = Calendar.getInstance().get(Calendar.YEAR);
    c = (i == 1 | i == 3 | i == 5 | i == 7 | i == 8 | i == 10 | i == 12) ?
            31 :
            (i != 2) ?
                    30 :
                    (i == 2 & Task3LeapYear.isLeapYear(nowYear)) ?
                            29 :
                            (i == 2 & !Task3LeapYear.isLeapYear(nowYear)) ?
                                    28 :
                                    0;
    return c;
    }
  

}
