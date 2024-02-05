package day08.practice;

import java.util.Scanner;

public class EmailTask2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter an e-mail: ");
    String email = kb.nextLine();
    int u = email.indexOf("_");
    int a = email.indexOf("@");
    int d = email.lastIndexOf(".");
    String firstName, lastName, domain;
    kb.close();
    firstName = email.substring(0,u).toLowerCase();
    firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
    lastName = email.substring(u+1,a).toLowerCase();
    lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
    domain = email.substring(a+1,d).toLowerCase();
    System.out.println("First name: " + firstName + "\n" +
    "Last name: " + lastName + "\n" +
    "Domain: " + domain        );
  }
}
