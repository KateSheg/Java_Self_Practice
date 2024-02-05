package day04.practice;

public class Task2LaptopModels {
  public static void main(String[] args) {
    String model = "apple";
    switch (model) {
      case "apple": {
        System.out.println("Apple-no virus");
        break;
      }
      case "dell": {
        System.out.println("Though one");
        break;
      }
      case "acer": {
        System.out.println("Not recommended");
        break;
      }
      default: {
        System.out.println("Do not buy that one!");
        break;
      }
    }
  }
}
