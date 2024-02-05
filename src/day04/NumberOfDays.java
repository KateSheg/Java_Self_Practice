package day04;

import day03.Task3LeapYear;
import java.util.Calendar;
import static day04.MonthName.monthName2;


public class NumberOfDays {
  public static void main(String[] args) {
    int i = 6;
    int c;
    int nowYear = Calendar.getInstance().get(Calendar.YEAR);
    //System.out.println(monthName2(3));
    c = (i == 1 | i == 3 | i == 5 | i == 7 | i == 8 | i == 10 | i == 12) ?
            31 :
            (i != 2) ?
                    30 :
                    (i == 2 & Task3LeapYear.isLeapYear(nowYear)) ?
                            29 :
                            (i == 2 & !Task3LeapYear.isLeapYear(nowYear)) ?
                                    28 :
                                    0;
    System.out.println(c + " days is in " + monthName2(i));
  }
}
