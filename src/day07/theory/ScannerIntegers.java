package day07.theory;

import java.util.Scanner;

public class ScannerIntegers {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter int a1 = ");
    int a1 = kb.nextInt();
    System.out.print("Enter int a2 = ");
    int a2 = kb.nextInt();
    System.out.print("Enter int a3 = ");
    int a3 = kb.nextInt();
    System.out.print("Enter int a4 = ");
    int a4 = kb.nextInt();
    kb.close();
    System.out.println("a1 = " + a1);
    System.out.println("a2 = " + a2);
    System.out.println("a3 = " + a3);
    System.out.println("a4 = " + a4);
  }
}
