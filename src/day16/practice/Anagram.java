package day16.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Anagram {
  public static void main(String[] args) {
    String s1 = "xyze"; //""abcd";
    String[] c1 = s1.split("");
    Set<String> a1 = new LinkedHashSet<>();
    for (String each: c1) if (!a1.contains(each)) a1.add(each);
    
    String s2 = "xyzd"; //"ccddabaa";
    String[] c2 = s2.split("");
    Set<String> a2 = new LinkedHashSet<>();
    for (String each: c2) if (!a2.contains(each)) a2.add(each);
    
    if (a1.equals(a2)) System.out.println("True");
    else System.out.println("False");;
  }
}
