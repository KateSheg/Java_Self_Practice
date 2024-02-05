package day09.practice;

public class ClassmatesReversed {
  public static void main(String[] args) {
    String[] classmates = {"Люба ШВЕЦОВА","Татьяна ГОРКИНА", "Вова СОКОЛОВ", "Даша ВОРОТЫНСКАЯ", "Таня ИГНАТОВА", "Артём ОНИСЬКО", "Катя АГЕЕЦ", "Юля РАДЮКЕВИЧ", "Максим СВИТЫК", "Вова ДОРОЖКО"};
    String s = "";
    for (int i=0; i<classmates.length; i++) {
      s="";
      for (int j=classmates[i].length()-1; j>=0; j--) {
        s += classmates[i].charAt(j);
      }
      System.out.println(classmates[i] + " -> " + s);
    }
  }
}
