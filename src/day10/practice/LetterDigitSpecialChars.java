package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterDigitSpecialChars {
  public static void main(String[] args) {
    String originalString = "Wooden Spoon123!";
    String[] original = originalString.split("");
    ArrayList<String> originalList = new ArrayList<String>(Arrays.asList(original));
    for (String s : originalList) System.out.println(s);
    originalList.forEach(System.out::print);
    ArrayList<String> letters = new ArrayList<>();
    ArrayList<String> digits = new ArrayList<>();
    ArrayList<String> specials = new ArrayList<>();
    char c;
    for (String s : originalList) {
      c = s.charAt(0);
      if (Character.isLetter(c)) letters.add(s);
      if (Character.isDigit(c)) digits.add(s);
      if (!Character.isLetterOrDigit(c)) specials.add(s);
    }
    /*String result = new Arrays.asString(letters);
    System.out.println(result);
    /*result = Arrays.toString(digits);
    System.out.println(digits);
    System.out.println(specials);*/
  }
}
