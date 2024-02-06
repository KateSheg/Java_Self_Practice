package day11.practice.restaurant_task;

import java.util.ArrayList;

public class LocalRestaurant {
  public static void main(String[] args) {
    
    ArrayList<Restaurant> allRestaurants = new ArrayList<>();
    int chefIDStart = 1000;
    int waiterIDStart = 3000;
    int waitersTotalNumber = 0;
    int chefsTotalNumber = 0;
    
    int restaurantsTotalNumber = (int) Math.round(Math.random()*5);
    for (int j=0; j<restaurantsTotalNumber; j++) {
      int z = restaurantsTotalNumber - 1;
      System.out.println("\n" + j + "/" + z);
      ArrayList<Chef> c = new ArrayList<>();
      for (int i=0; i<Math.round(Math.random()*3+1); i++) {
        chefsTotalNumber++;
        Chef p = new Chef("c_" + i, chefIDStart + chefsTotalNumber, 30, true);
        c.add(p);
      }
      
      ArrayList<Waiter> w = new ArrayList<>();
      for (int i=0; i<Math.random()*10+1; i++) {
        waitersTotalNumber++;
        Waiter p = new Waiter("w_" + i, waiterIDStart + waitersTotalNumber, 10, false);
        w.add(p);
      }
      
      long k = Math.round(Math.random()*6);
      Restaurant r = new Restaurant("o_" +j, "l_" + j, (int) k);
      r.hireChefs(c);
      r.hireWaiters(w);
      
      chefsTotalNumber++;
      Chef c1 = new Chef("c_s" , 2000 + chefsTotalNumber, 50, true);
      r.hireChef(c1);
      waitersTotalNumber++;
      Waiter w1 = new Waiter("w_s" , 4000 + waitersTotalNumber, 10, false);
      r.hireWaiter(w1);
      //System.out.println("\nSingle added chef:" + c1);
      
      System.out.println("Before:");
      System.out.println(r.chefs);
      System.out.println(r.waiters);
      
      int sc = (int) Math.round(Math.random()*(r.chefs.size()-2)+1);
      int sw = (int) Math.round(Math.random()*(r.waiters.size()-2)+1);
      System.out.println("\nto be fired:" + r.chefs.get(sc) + r.waiters.get(sw));
      r.fireChef(r.chefs.get(sc).employeeID);
      r.fireWaiter(r.waiters.get(sw).employeeID);
      
      System.out.println("After:");
      System.out.println(r);
      System.out.print("---------------------------------------------------");
      allRestaurants.add(r);
    }
  }
}
