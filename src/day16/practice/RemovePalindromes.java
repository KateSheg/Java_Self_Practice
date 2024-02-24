package day16.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovePalindromes {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
            "reviver", "racecar", "madam"));
    Set<String> l = new LinkedHashSet<>();
    System.out.println(a.size());
    for (String each : a) {
      System.out.println("\n" + "\u001B[34m" + each + "\u001B[0m" + " ???");
      if (!l.contains(each) && !isPalindrome(each)) l.add(each);
    }
    System.out.println(l);
  }
  
  public static boolean isPalindrome(String each) {
    //System.out.println("->");
    String[] a = each.toLowerCase().split("");
    System.out.print(a.length);
    boolean f = true;
    int k = (int) Math.floor(a.length / 2);
    System.out.println(", k = " + k);
    for (int i = 0; i < k; i++) {
      System.out.println(a[i] + "\u001B[30m" + " & " + "\u001B[0m" + a[a.length - 1 - i]);
      if (!a[i].equals(a[a.length - 1 - i])) f = false;
    }
    if (f) System.out.println("\u001B[32m" + f + "\u001B[0m");
    else System.out.println("\u001B[31m" + f + "\u001B[0m");
    return f;
  }
  
}
