package day11.practice.restaurant_task;

import java.util.ArrayList;

public class Restaurant {
  public String owner;
  public String location;
  public int numberOfStars;
  public ArrayList<Waiter> waiters = new ArrayList<>();
  public ArrayList<Chef> chefs = new ArrayList<>();
  
  public Restaurant(String owner, String location, int numberOfStars) {
    this.owner = owner;
    this.location = location;
    this.numberOfStars = numberOfStars;
  }
  
  public void hireWaiter(Waiter waiter) {
    //System.out.println(waiter);
    this.waiters.add(waiter);
  }
  
  public void hireWaiters(ArrayList<Waiter> waiters) {
    
       //Collections.addAll()
    this.waiters.addAll(waiters); // Почему метод .addAll() без класса Collections?
//    for (int i=0; i<waiters.size(); i++) {
//      this.waiters.add(waiters.get(i));
//    }
  }
  
  public void hireChef(Chef chef) {
    this.chefs.add(chef);
  }
  
  public void hireChefs(ArrayList<Chef> chefs) {
    this.chefs.addAll(chefs);
  }
  
  public void fireChef(int ID) {
    //chefs.removeIf(p->p.this.employeeID==employeeID);
    //chefs.indexOf(p->p.employeeID==ID);
    for (int i=0; i<chefs.size(); i++) {
      if (chefs.get(i).employeeID==ID) {
        chefs.remove(i);
        break;
      }
    }
  }
  
  public void fireWaiter(int ID) {
    //waiters.removeIf(p->p.employeeID==employeeID);
    for (int i=0; i<waiters.size(); i++) {
      if (waiters.get(i).employeeID==ID) {
        waiters.remove(i);
        break;
      }
    }
  }
  
  @Override
  public String toString() {
    return "\nRestaurant " +
            "\n\towner: " + owner + '\'' +
            "\n\tlocation: " + location + '\'' +
            "\n\tnumberOfStars: " + numberOfStars +
            "\n\tchefs: " + chefs +
            "\n\twaiters: " + waiters;
  }
  
  public static void main(String[] args) {
  
  }
}
