package day08.practice;

import java.util.Scanner;

public class EmailTask1 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your e-mail: ");
    String oldEmail = kb.nextLine();
    String newEmail = oldEmail;
    int u = oldEmail.indexOf("_");
    int a = oldEmail.indexOf("@");
    if (u>=0) {
      newEmail = oldEmail.substring(u+1,a)+"_"+oldEmail.substring(0,u)+oldEmail.substring(a);
    }
    System.out.println(newEmail);
    kb.close();
  }
}
