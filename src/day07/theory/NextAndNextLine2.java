package day07.theory;

import java.util.Scanner;

public class NextAndNextLine2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String fullName = kb.nextLine();
    System.out.print("Enter your school's name: ");
    String schoolName = kb.nextLine();
    System.out.print("Enter your gender: ");
    String gender = kb.nextLine();
    System.out.print("Enter your age: ");
    String age = kb.nextLine();
    System.out.print("Enter your street: ");
    String street = kb.nextLine();
    kb.close();
  }
}
