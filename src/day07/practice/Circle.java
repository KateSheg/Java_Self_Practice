package day07.practice;

import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    int r = kb.nextInt();
    kb.close();
    System.out.println("The area of the Circle is " + 3.14*r*r +
            "\nThe perimeter of the Circle is " + 2*3.14*r);
  }
}
