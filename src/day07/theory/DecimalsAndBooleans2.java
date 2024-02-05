package day07.theory;

import java.util.Scanner;

public class DecimalsAndBooleans2 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter decimal a1 = ");
    double a1 = kb.nextDouble();
    System.out.print("Enter decimal a2 = ");
    double a2 = kb.nextDouble();
    System.out.print("Enter true/false a3 = ");
    boolean a3 = kb.nextBoolean();
    kb.close();
    
    System.out.println("a1 = " + a1);
    System.out.println("a2 = " + a2);
    System.out.println("a3 = " + a3);
  }
}
