package day08.practice;

import java.util.Scanner;

public class TipCalculator {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Split or No Split (Yes or No)? ");
    String split = kb.nextLine();
    System.out.print("Enter the number of people: ");
    int people = kb.nextInt();
    kb.nextLine();
    System.out.print("Enter the check amount: ");
    int check = kb.nextInt();
    kb.nextLine();
    System.out.print("How was the service quality? ");
    String service = kb.nextLine();
    kb.close();
    
    System.out.println("Number of people entered: " + people);
    
    int tipPercent = 0;
    switch (service) {
      case "Poor":
        tipPercent = 5;
        break;
      case "Fair":
        tipPercent = 10;
        break;
      case "Good":
        tipPercent = 15;
        break;
      case "Great":
        tipPercent = 20;
        break;
      case "Excellent":
        tipPercent = 25;
        break;
    }
    System.out.println("Total to pay: $" + (double)check*(100+tipPercent)/100);
    System.out.println("Total tip: $" + (double)check * tipPercent / 100);
    System.out.println("Total per person: $" + (double)(check*(100+tipPercent)/100 / people));
    System.out.println("Tip per person: $" + (double) check * tipPercent / 100 / people);
  }
}
