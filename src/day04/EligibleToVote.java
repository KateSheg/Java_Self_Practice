package day04;

import java.util.Calendar;

public class EligibleToVote {
  public static void main(String[] args) {
    //int Year = 1985;
    int Year = 2015;
    int nowYear = Calendar.getInstance().get(Calendar.YEAR);
    
    if (nowYear - Year >= 18) {
      System.out.println("You are eligible to vote");
    }
    else System.out.println("You are NOT eligible to vote");
  }
}
