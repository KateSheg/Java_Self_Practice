package day11.practice.restaurant_task;

public class Waiter {
  public String name;
  public int employeeID;
  public double hourlyRate;
  public boolean fullTime;
  
  public Waiter(String name, int employeeID, double hourlyRate, boolean fullTime) {
    this.name = name;
    this.employeeID = employeeID;
    this.hourlyRate = hourlyRate;
    this.fullTime = fullTime;
  }
  
  public void makeOrder() {
    System.out.println(name + " is making an order");
  }
  
  public void washDishes() {
    System.out.println(name + " is washing the dishes");
  }
  
  @Override
  public String toString() {
    return "\nWaiter: " +
            "name='" + name + '\'' +
            ", employeeID=" + employeeID +
            ", hourlyRate=" + hourlyRate +
            ", fullTime=" + fullTime;
  }
  
  public static void main(String[] args) {
  
  }
}
