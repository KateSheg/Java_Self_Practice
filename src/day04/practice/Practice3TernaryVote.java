package day04.practice;
import java.util.Calendar;
public class Practice3TernaryVote {
   public static void main(String[] args) {
    int yearOfBirth = 2021;
    int nowYear = Calendar.getInstance().get(Calendar.YEAR);
    String result = (nowYear - yearOfBirth >= 18) ? "You are eligible to vote" : "You are NOT eligible to vote";
    System.out.println(result);
  }
}
