package day08.practice;

import java.util.Scanner;

public class WithoutFirstChar {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter two words:");
    String s1 = kb.nextLine();
    String s2 = kb.nextLine();
    System.out.println(s1.substring(1)+s2.substring(1));
    kb.close();
  }
}
