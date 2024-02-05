package day07.theory;

import java.util.Scanner;

public class NextAndNextLine {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = kb.nextInt();
    kb.nextLine();
    System.out.print("Enter your first and last name: ");
    String fullName = kb.nextLine();
    System.out.println("Age:\t\t" + age);
    System.out.println("FulL name:\t" + fullName);
    kb.close();
  }
}
