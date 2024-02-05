package day07.practice;

import java.util.Scanner;

public class MyInfoGo {
  public static void main(String[] args) {
    MyInfo mi = new MyInfo();
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    mi.fullName = kb.nextLine();
    System.out.print("Enter your age: ");
    mi.age = kb.nextInt();
    kb.nextLine();
    System.out.print("Enter your gender: ");
    mi.gender = kb.nextLine();
    System.out.print("Enter your phone number: ");
    mi.phoneNumber = kb.nextLong();
    kb.nextLine();
    System.out.print("Enter your zip code: ");
    mi.zipCode = kb.nextInt();
    kb.nextLine();
    System.out.print("Enter your school name: ");
    mi.schoolName = kb.nextLine();
    System.out.print("Enter your city name: ");
    mi.city = kb.nextLine();
    System.out.print("Enter your state name: ");
    mi.state = kb.next();
    kb.nextLine();
    System.out.print("Enter building number: ");
    mi.buildingNumber = kb.nextInt();
    kb.nextLine();
    System.out.print("Enter street name: ");
    mi.streetName = kb.nextLine();
    kb.close();
    System.out.println(mi);
  }
}
