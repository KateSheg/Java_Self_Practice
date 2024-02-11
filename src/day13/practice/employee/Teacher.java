package day13.practice.employee;

public class Teacher extends Employee{
  
  public Teacher(String name, int age, int salary, String companyName, String employeeID) {
    super(name, age, employeeID, "teacher", salary, companyName);
  }
  
  public void work() {
    System.out.println("\n" + startColor("white") + " " + getName() + " is teaching" + startColor(" "));
  }
  
  @Override
  public String toString() {
    return startColor("purple") + this.getClass().getSimpleName() +
            ": name=" + getName() +
            ", age=" + getAge() +
            ", employeeID='" + getEmployeeID() + '\'' +
            ", salary=" + getSalary() +
            ", companyName='" + getCompanyName() +
            startColor(" ");
  }
}
