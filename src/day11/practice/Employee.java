package day11.practice;

public class Employee {
  public String name;
  public int age;
  public char gender;
  public String jobTitle;
  public double salary;
  
  public Employee(String name, String jobTitle, double salary) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }
  
  public Employee(String name, int age, String jobTitle, double salary) {
    this(name, jobTitle, salary);
    this.age = age;
  }
  
  public Employee(String name, char gender, String jobTitle, double salary) {
    this(name, jobTitle, salary);
    this.gender = gender;
  }
  
  public Employee(String name, int age, char gender, String jobTitle, double salary) {
    this(name, age, jobTitle, salary);
    this.gender = gender;
  }
  public String toString() {
    return "\n" + name + " is working as " + jobTitle +
    "\nage = " + age +
    "\ngender = " + gender +
    
    "\nsalary = $" + salary;
  }
  
  public static void main(String[] args) {
    Employee e1 = new Employee("Eric Shegidevich",11, "cashier", 20);
    System.out.println(e1);
    Employee e2 = new Employee("Denis Shegidevich", "driver", 20);
    System.out.println(e2);
  }
}
