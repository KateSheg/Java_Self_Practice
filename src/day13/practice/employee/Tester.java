package day13.practice.employee;

public class Tester extends Employee{
  public Tester(String name, int age, int salary, String companyName, String employeeID) {
    super(name, age, employeeID, "tester", salary, companyName);
  }
  
  public void work() {
    System.out.println("\n" + getJobTitle() + " " + getName() + " is testing");
  }
}
