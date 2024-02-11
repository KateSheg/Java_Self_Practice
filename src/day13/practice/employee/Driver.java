package day13.practice.employee;

public class Driver extends Employee{
  
  public Driver(String name, int age, int salary, String companyName, String employeeID) {
    super(name, age, employeeID, "driver", salary, companyName);
  }
  
  public void work() {
    System.out.println("\n" + startColor("white") + getJobTitle() + " " + getName() + " is driving" + startColor(" "));
  }
  
  @Override
  public String toString() {
    return startColor("cyan") + this.getClass().getSimpleName() +
            ": name=" + getName() +
            ", age=" + getAge() +
            ", employeeID='" + getEmployeeID() + '\'' +
            ", salary=" + getSalary() +
            ", companyName='" + getCompanyName() +
            startColor(" ");
  }
}
