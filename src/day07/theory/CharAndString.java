package day07.theory;

import java.util.Scanner;

public class CharAndString {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter some symbol: ");
    String s = kb.next().substring(0,1);
    System.out.println("Would you like to continue? (Yes/No)");
    kb.nextLine();
    String c = kb.nextLine();
    System.out.println("Saved symbol is \"" + s + "\"");
    System.out.println("You have entered: " + c);
    kb.close();
  }
}
