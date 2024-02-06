package day11.practice.restaurant_task;

public class Chef {
  public String name;
  public int employeeID;
  public double hourlyRate;
  public boolean fullTime;
  
  public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
    this.name = name;
    this.employeeID = employeeID;
    this.hourlyRate = hourlyRate;
    this.fullTime = fullTime;
  }
  
  public String toString() {
    return "\nChef: " +
            "name='" + name + '\'' +
            ", employeeID=" + employeeID +
            ", hourlyRate=" + hourlyRate +
            ", fullTime=" + fullTime +
            '}';
  }
  
  public void makeOrder() {
    System.out.println(name + " is making an order");
  }
  
  public void washDishes() {
    System.out.println(name + " is washing the dishes");
  }
  
  public static void main(String[] args) {
    Chef c = new Chef("Kate", 3939455, 30, true);
    System.out.println(c);
    c.makeOrder();
    c.washDishes();
  }
}
