package day05.theory;

public class KPH_MPH {
  public static void main(String[] args) {
    tableOfDistanceUnits(20,140);
  }
  
  public static void tableOfDistanceUnits(int startI, int stopI) {
    System.out.println("KPH\t\tMPH\n--------------");
    for (int i = startI; i <= stopI; i = i + 10) {
      System.out.println(i +"\t\t" + (int) (i * 0.62));
    }
  }
}
