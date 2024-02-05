package day06.practice;

public class Task3_MaximumAndMinimum {
  public static void main(String[] args) {
    System.out.println(max(10.5, 30.2));
    System.out.println(min(100, 200));
  }
  
  public static int max(int a, int b) {
    return (a < b) ? b : a;
  }
  
  public static double max(double a, double b) {
    return (a < b) ? b : a;
  }
  
  public static int min(int a, int b) {
    return (a > b) ? b : a;
  }
  
  public static double min(double a, double b) {
    return (a > b) ? b : a;
  }
}
