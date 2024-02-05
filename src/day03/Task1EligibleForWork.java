package day03;

import java.util.Calendar;

public class Task1EligibleForWork {
  public static void main(String[] args) {
    //int Year = 1985;
    int Year = 1957;
    int nowYear = Calendar.getInstance().get(Calendar.YEAR);
    
    if (nowYear - Year >= 18 & nowYear - Year <= 65) {
      System.out.println("Yes");
    }
    else System.out.println("No!");
  }
}
