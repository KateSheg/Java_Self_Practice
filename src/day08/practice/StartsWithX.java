package day08.practice;

import java.util.Scanner;

public class StartsWithX {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = kb.next();
    char c = 120;
    if (word.charAt(0)==c) {
      word = word.replaceFirst("x","a");
      System.out.println("After replacing: " + word);
    }
    kb.close();
  }
}
