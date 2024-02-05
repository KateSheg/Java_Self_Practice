package day08.theory;

import java.util.Scanner;

public class FirstWord {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter at least 2 words: ");
    String s = kb.nextLine();
    int p = s.indexOf(" ");
    kb.close();
    System.out.println("p="+p);
    System.out.println(s.substring(0,p));
  }
}
