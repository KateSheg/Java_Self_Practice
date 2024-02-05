package day07.practice;

import java.util.Scanner;

public class FamilyMembers {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("How many people do you live with: ");
    int n = kb.nextInt();
    kb.close();
    if (n<3) System.out.println("Lives with less than three people.");
    else if (n>=3 & n<=6) System.out.println("Lives with 3-6 people.");
    else if (n>6) System.out.println("Lives with more than six people.");
  }
}
