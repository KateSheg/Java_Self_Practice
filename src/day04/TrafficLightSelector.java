package day04;

public class TrafficLightSelector {
  public static void main(String[] args) {
    String a = "r";
    switch (a) {
      case "r" : {
        System.out.println("Red");
        break;
      }
      case "R" : {
        System.out.println("Red");
        break;
      }
      case "y" : {
        System.out.println("Yellow");
        break;
      }
      case "Y" : {
        System.out.println("Yellow");
        break;
      }
      case "g" : {
        System.out.println("Green");
        break;
      }
      case "G" : {
        System.out.println("Green");
        break;
      }
    }
  }
}
