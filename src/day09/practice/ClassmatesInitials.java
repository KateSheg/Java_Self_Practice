package day09.practice;

public class ClassmatesInitials {
  public static void main(String[] args) {
    String[] classmates = {"Люба ШВЕЦОВА","Татьяна ГОРКИНА", "Вова СОКОЛОВ", "Даша ВОРОТЫНСКАЯ", "Таня ИГНАТОВА", "Артём ОНИСЬКО", "Катя АГЕЕЦ", "Юля РАДЮКЕВИЧ", "Максим СВИТЫК", "Вова ДОРОЖКО"};
    for (int i=0; i<10; i++) {
      System.out.println(initials(classmates[i]));
    }
  }
  
  public static String initials(String name) {
    String s = "";
    int p = name.indexOf(" ") + 1;
    s = name.charAt(0)+"."+name.charAt(p)+".";
    return s;
  }
}
