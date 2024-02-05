package day10.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperCaseAndLowerCase {
  public static void main(String[] args) {
    String s1 = "JAVA java";
    String[] s2 = s1.split("");
    ArrayList<String> s3 = new ArrayList<>(Arrays.asList(s2));
    int nU = 0;
    int nL = 0;
    for (String c : s3) {
      System.out.println(c);
      if (Character.isUpperCase(c.charAt(0))) nU++;
      if (Character.isLowerCase(c.charAt(0))) nL++;
    }
    System.out.println(nU==nL);
    System.out.println("nU="+nU+" nL="+nL);
  }
}
