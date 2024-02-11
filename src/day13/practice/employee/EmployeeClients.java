package day13.practice.employee;

public class EmployeeClients {
  public static void main(String[] args) {
    Person eric = new Person("Eric Shegidevich", 11);
    eric.work();
    
    Person kate1 = new Person("Kate Shegidevich", 43);
    kate1.work();
    
    Employee kate2 = new Employee("Kate Shegidevich", 43, "", "multi", 20, "different");
    kate2.work();
    
    Developer alik = new Developer("Alik Shegidevich", 44, "03933884", "C#", 50, "FINRA");
    alik.work();
    System.out.println(alik);
    
    Driver kate3 = new Driver("Kate Shegidevich", 43, 20, "Amazon", "87398423");
    kate3.work();
    System.out.println(kate3);
    kate3.setSalary(25);
    System.out.println(kate3);
  }
}
