package day08.theory;

import java.util.Scanner;

public class SubstringPositionFinder {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String s1 = kb.nextLine();
    System.out.print("Enter second string: ");
    String s2 = kb.nextLine();
    kb.close();
    int k = s1.indexOf(s2);
    if (k>=0) System.out.println(k);
    else System.out.println("Not found");
  }
}
