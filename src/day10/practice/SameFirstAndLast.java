package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
    System.out.println("list: "+list);
    ArrayList<String> list2 = new ArrayList<>();
    for (String l: list) {
      System.out.print("l = " + l + "   ");
      System.out.println(l.toLowerCase().charAt(0) + " & " + l.toLowerCase().charAt(l.length()-1));
      System.out.println(l.toLowerCase().charAt(0)==l.toLowerCase().charAt(l.length()-1));
      if (l.toLowerCase().charAt(0)!=l.toLowerCase().charAt(l.length()-1)) list2.add(l);
    }
    System.out.println("list2: "+list2);
    //list.removeIf( p-> p.toLowerCase().charAt(0) == p.charAt(p.toLowerCase().length()-1))
  }
}
