package day14.practice.car_shop_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarShop {
  public static void main(String[] args) {
    Car[] cars = {
      new Honda("Pilot", "White", 2010, 25000),
      new Audi("Q6", "Red", 2014, 32000),
      new Honda("Accord", "White", 2011, 20000),
      new Audi("Q4", "Blue", 2015, 33000),
      new Audi("A7", "Black", 2019, 35000),
      new Audi("Q8", "White", 2018, 40000),
      new Audi("Q5", "Purple", 2009, 30000),
      new Audi("A4", "Black", 2011, 30000),
      new Honda("Civic", "Red", 2018, 30000),
      new Honda("CR-V", "Red", 2012, 23000),
      new Honda("HR-V", "Blue", 2019, 35000),
      new Tesla("Model 3", "White", 2015, 45000),
      new Tesla("Model Y", "Black", 2017, 65000),
      new Tesla("Model X", "White", 2016, 48000),
      new Tesla("Model X", "Blue", 2014, 48000),
    };
    
    ArrayList<Car> goodCars = new ArrayList<>();
    for (Car each: cars) {
      if (each instanceof Honda && each.getYear()>=2010 && each.getYear()<=2011  ||
              each instanceof Audi && each.getYear()>=2015 && each.getYear()<=2019 ||
              each instanceof Tesla && each.getYear()>=2015 && each.getYear()<=2016)
        System.out.println(each);
      else goodCars.add(each);
    }
    
    int min = goodCars.get(0).getPrice();
    int indexMin = 0;
    
    int max = goodCars.get(0).getPrice();
    int indexMax = 0;
    
    for (int i=1; i<goodCars.size(); i++) {
      if (goodCars.get(i).getPrice()>max) {
        max = goodCars.get(i).getPrice();
        indexMax = i;
      }
      if (goodCars.get(i).getPrice()<min) {
        min = goodCars.get(i).getPrice();
        indexMin = i;
      }
    }
    System.out.println();
    System.out.println("The chippest car is " + goodCars.get(indexMin));
    System.out.println("The most expensive car is " + goodCars.get(indexMax));
    System.out.println();
    
    ArrayList<Tesla> teslaCars = new ArrayList<>();
    for (Car each: goodCars) {
      if (each instanceof Tesla) {
        teslaCars.add((Tesla) each);
        System.out.println(each);
      }
    }
    
  }
}
