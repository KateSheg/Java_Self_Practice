package day07.practice;

import java.util.Scanner;

public class Task1_EmployeeClients {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Task1_Employee e1 = new Task1_Employee();
    e1.name = "Ekaterina SHEGIDEVICH";
    e1.age = 43;
    e1.gender = 70;
    e1.jobTitle = "driver";
    e1.salary = 20.0;
    kb.close();
    System.out.println(e1);
    e1.work();
  }
}
