package day07.practice;

import java.util.Scanner;

public class MilesToKM {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the number of miles: ");
    double miles = kb.nextDouble();
    kb.close();
    System.out.println(miles + " miles is equal to " + 1.6*miles + " kilometers.");
  }
}
