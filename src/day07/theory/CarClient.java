package day07.theory;

public class CarClient {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.maker = "Toyota";
    car1.model = "Corolla";
    car1.currentSpeed = 65;
    car1.color = "Red";
    car1.printCarInfo();
    car1.drive();
    car1.showCurrentSpeed(70);
    car1.accelerate(10);
    car1.showCurrentSpeed(70);
  }
}
