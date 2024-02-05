package day04;

public class CrewAndPassenger {
  public static void main(String[] args) {
    int totalQuantity = 75;
    switch (totalQuantity) {
      case 50: {
        System.out.println("20 crew, 30 passengers");
        break;
      }
      case 75: {
        System.out.println("25 crew, 50 passengers");
        break;
      }
      case 100: {
        System.out.println("30 crew, 70 passengers");
        break;
      }
      default: {
        System.out.println("not valid");
        break;
      }
    }
  }
}
