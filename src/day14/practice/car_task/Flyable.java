package day14.practice.car_task;

public interface Flyable {
  boolean canFly = true;
  
  abstract void fly();
  
  public static void needDL() {
    System.out.println("Flying cars still need Driver License to ride");
  }
  
  public default void howIsDriving() {
    System.out.println("If you don't fear height it will be nice");
  }
}
