package day08.practice;

import java.util.Scanner;

public class FullNameInRegularFormat {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = kb.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = kb.nextLine();
    firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
    lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
    System.out.println(firstName + " " + lastName);
  }
}
