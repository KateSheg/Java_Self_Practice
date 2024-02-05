package day08.theory;

import java.util.Scanner;

public class ValidateUserInput {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String city = "";
    do {
      System.out.print("Enter a city: ");
      city = kb.nextLine();
    }
    while (city.isBlank() | city.length()<2);
    kb.close();
    System.out.println(city);
  }
}
