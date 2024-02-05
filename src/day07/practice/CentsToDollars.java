package day07.practice;

import java.util.Scanner;

public class CentsToDollars {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the cents: ");
    String c = kb.nextLine();
    int l = c.length();
    kb.close();
    System.out.println(c + " cents is equal to " + c.substring(0,l-2) + " dollars and " + c.substring(l-2,l) + " cents.");
  }
}
