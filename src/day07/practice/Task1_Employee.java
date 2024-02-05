package day07.practice;

public class Task1_Employee {
  public String name;
  public int age;
  public char gender;
  public String jobTitle;
  public double salary;
  
  public void work() {
    System.out.println(jobTitle + " " + name + " is working.");
  }
  
  /*public String toString() {
    String s = "name=" + name + ", age=" + age + ", gender=" + gender + ", jobTitle=" + jobTitle + ", salary=" + salary;
    return s;
  }*/
  
  public String toString() {
    return "Task1_Employee{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            ", jobTitle='" + jobTitle + '\'' +
            ", salary=" + salary +
            '}';
  }
}
