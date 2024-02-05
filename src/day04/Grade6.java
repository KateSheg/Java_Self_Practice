package day04;

public class Grade6 {
  public static void main(String[] args) {
    byte grade = 16;
    String s = "";
    if (grade >= 1 & grade <= 5) s = "Elementary school";
    else if (grade >= 6 & grade <= 8) s = "Middle school";
    else if (grade >= 9 & grade <= 12) s = "High school";
    else if (grade >= 13 & grade <= 16) s = "College";
    else if (grade >= 17 & grade <= 18) s = "Grad school";
    else s = "Invalid grade level.";
    System.out.println(s);
  }
}
