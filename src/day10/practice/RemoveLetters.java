package day10.practice;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
  public static void main(String[] args) {
    ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));
    System.out.println(list);
    ArrayList<Character> list2 = new ArrayList<>();
    for (Character l: list) {
      if (!Character.isLetter(l)) list2.add(l);
    }
    System.out.println(list2);
  }
}
