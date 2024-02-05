package day08.theory;

import java.util.Scanner;

public class EachCharacter {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter some string: ");
    String s = kb.nextLine();
    int l = s.length();
    kb.close();
    if (l>0) {
      System.out.println("The length of entered string is " + l);
      for (int i=0; i<l; i++)
      System.out.println(s.charAt(i));
    }
    else System.err.println("The text can not be null or empty");
  }
}
