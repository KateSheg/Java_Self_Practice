package day09.practice;

public class StudentGrade {
  public static void main(String[] args) {
    String[] studentNames = {"Люба ШВЕЦОВА","Татьяна ГОРКИНА", "Вова СОКОЛОВ", "Даша ВОРОТЫНСКАЯ", "Таня ИГНАТОВА", "Артём ОНИСЬКО", "Катя АГЕЕЦ", "Юля РАДЮКЕВИЧ", "Максим СВИТЫК", "Вова ДОРОЖКО"};
    int[] scores = {74,66,37,94,82,78,99,88,47,91};
    char[] grades = new char[10];
    for (int i=0; i<studentNames.length; i++) {
      if (scores[i] >= 90 & scores[i] <= 100) grades[i]='A';
      else if (scores[i] >= 80 & scores[i] <= 89) grades[i]='B';
      else if (scores[i] >= 70 & scores[i] <= 79) grades[i]='C';
      else if (scores[i] >= 60 & scores[i] <= 69) grades[i]='D';
      else if (scores[i] >= 0 & scores[i] <= 59) grades[i]='F';
      System.out.println(studentNames[i] + "'s score is " + scores[i] +", and grade is " + grades[i]);
    }
  }
}
