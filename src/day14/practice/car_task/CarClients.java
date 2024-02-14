package day14.practice.car_task;

public class CarClients {
  public static void main(String[] args) {
    
    Toyota toyota = new Toyota("Corolla", 1989, 2500, "white");
    toyota.start();
    toyota.drive();
    System.out.println(toyota);
    toyota.setPrice(3590);
    System.out.println(toyota);
    
    System.out.println("-----------------------------------------------------------");
    
    Audi audi = new Audi("a6", 2019, 25000, "black");
    audi.start();
    audi.autoPark();
    audi.drive();
    System.out.println(audi.toString());
    
    System.out.println("-----------------------------------------------------------");
    
    BMW bmw = new BMW("x7", 2020, 34_000, "silver");
    bmw.start();
    bmw.drive();
    System.out.println(bmw.toString());
    
    System.out.println("-----------------------------------------------------------");
    
    Honda honda = new Honda("Accord", 2024, 27_398, "blue");
    honda.start();
    honda.drive();
    System.out.println(honda.toString());
    
    System.out.println("-----------------------------------------------------------");
    
    CydeoCar cydeo = new CydeoCar("tutorial",2024, 12700, "pink");
    cydeo.start();
    cydeo.drive();
    cydeo.selfDrive();
    cydeo.autoPark();
    cydeo.fly();
    Flyable.needDL();
    cydeo.howIsDriving();
    System.out.println(cydeo);
    
    System.out.println("-----------------------------------------------------------");
    
    
  }
}
