package day03;

public class Task1 {
  public static void main(String[] args) {
    int b = 2;
    
    boolean result = (++b == 2 || b == 2) && --b == 2;
    
    System.out.println("result = " + result);
    System.out.println("b = " + b);
    
    int applesCount = 2;
    int orangesCount = 3;
    int pearsCount = 4;
    
    applesCount = 5;
    orangesCount = 3;
    pearsCount = 4;
    boolean z;
    z = (applesCount < orangesCount) || (orangesCount >= pearsCount);
    System.out.println("the number of apples is less than the number of oranges or the number of oranges is greater than or equal to the number of pears IS \n" + z);
    
    applesCount = 5;
    orangesCount = 3;
    pearsCount = 4;
    
  }
}
