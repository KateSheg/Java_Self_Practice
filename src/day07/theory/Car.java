package day07.theory;

public class Car {
  String maker;
  String model;
  String color;
  int currentSpeed;
  
  void printCarInfo() {
    System.out.println("Maker\t: " + maker);
    System.out.println("Model\t: " + model);
    System.out.println("Current Speed\t: " + currentSpeed);
    System.out.println("Color\t: " + color);
  }
  
  void drive() {
    System.out.println(maker + " " + model + " is driving...");
  }
  
  void showCurrentSpeed(int speedLimit) {
     if (currentSpeed <= speedLimit) System.out.println(maker + " is driving at " + currentSpeed +
             ", following the speed limit " + speedLimit);
     else System.out.println(maker + " is driving at " + currentSpeed + ", over the speed limit " + speedLimit);
  }
  
  void accelerate(int acceleration) {
    //currentSpeed = currentSpeed + acceleration;
    currentSpeed += acceleration;
    System.out.println("After accelerating by 10 new speed is " + currentSpeed);
  }
}
