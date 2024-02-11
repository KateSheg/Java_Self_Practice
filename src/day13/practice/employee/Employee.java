package day13.practice.employee;

public class Employee extends Person{
  
  private String employeeID;
  private String jobTitle;
  private int salary;
  private String companyName;
  
  public Employee(String name, int age, String employeeID, String jobTitle, int salary, String companyName) {
    super(name,age);
    setEmployeeID(employeeID);
    setJobTitle(jobTitle);
    setSalary(salary);
    setCompanyName(companyName);
  }
  
  public String getEmployeeID() {
    return employeeID;
  }
  
  public String getJobTitle() {
    return jobTitle;
  }
  
  public int getSalary() {
    return salary;
  }
  
  public String getCompanyName() {
    return companyName;
  }
  
  public void setEmployeeID(String employeeID) {
    if (isNotNullEmptyBlank(employeeID)) this.employeeID = employeeID;
    else {
      System.out.println(startColor("red") + "Incorrect employeeID" + startColor(" "));
      System.exit(1);
    }
  }
  
  public void setJobTitle(String jobTitle) {
    if (isNotNullEmptyBlank(jobTitle)) this.jobTitle = jobTitle;
  }
  
  public void setSalary(int salary) {
    if (salary>=0) this.salary = salary;
  }
  
  public void setCompanyName(String companyName) {
    if (isNotNullEmptyBlank(companyName)) this.companyName = companyName;
  }
  
  @Override
  public String toString() {
    return "\n" + this.getClass().getSimpleName() +
            ": name=" + getName() +
            ", age=" + getAge() +
            ", employeeID='" + employeeID + '\'' +
            ", jobTitle='" + jobTitle + '\'' +
            ", salary=" + salary +
            ", companyName='" + companyName;
  }
  
  public void work() {
    System.out.println("\n" + getName() + " " + getJobTitle() + " is working somehow");
  }
}
