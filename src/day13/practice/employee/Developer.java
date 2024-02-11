package day13.practice.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee{
  
  private String programmingLanguage;
  
  public Developer(String name, int age, String employeeID, String programmingLanguage, int salary, String companyName) {
    super(name, age, employeeID, "developer", salary, companyName);
    setProgrammingLanguage(programmingLanguage);
  }
  
  public String getProgrammingLanguage() {
    return programmingLanguage;
  }
  
  public void setProgrammingLanguage(String programmingLanguage) {
    if (isNotNullEmptyBlank(programmingLanguage) && isValidProgrammingLanguage(programmingLanguage))
      this.programmingLanguage = programmingLanguage;
  }
  
  public boolean isValidProgrammingLanguage(String programmingLanguage) {
    ArrayList<String> possibleProgrammingLanguages = new ArrayList<>(Arrays.asList("Java", "Basic", "JavaScript", "C",
            "C++", "Visual Basic", "C#", "Python", "CSS"));
    if (possibleProgrammingLanguages.contains(programmingLanguage)) return true;
    else {
      System.out.println(startColor("red") + "Incorrect programming language" + startColor(" "));
      System.exit(1);
      return false;
    }
  }
  public void work() {
    System.out.println("\n" + startColor("blue") + getJobTitle() + " " + getName() + " is coding" + startColor(" "));
  }
  
  @Override
  public String toString() {
    return startColor("yellow") + this.getClass().getSimpleName() +
            ": name=" + getName() +
            ", age=" + getAge() +
            ", employeeID='" + getEmployeeID() + '\'' +
            ", salary=" + getSalary() +
            ", companyName='" + getCompanyName() + "\'" +
            startColor(" ");
  }
}
