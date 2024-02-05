package day08.theory;

import java.util.Scanner;

public class KeywordSearch {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter text: ");
    String text = kb.nextLine();
    System.out.print("Enter keyword: ");
    String keyword = kb.nextLine();
    kb.close();
    
    if (text.toLowerCase().contains(keyword.toLowerCase())) System.out.println(true);
    else System.out.println("false");
  }
}
