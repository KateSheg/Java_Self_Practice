package day08.theory;

import java.util.Scanner;

public class LengthOfName {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String name = kb.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = kb.nextLine();
    kb.close();
    int l = name.length() + lastName.length();
    System.out.println("Total characters in your full name is " + l);
  }
}
