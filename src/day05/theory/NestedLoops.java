package day05.theory;

public class NestedLoops {
  public static void main(String[] args) {
    for (int i = 1; i <= 4; i++) {
      System.out.println("Outer Loop Iteration " + i);
      for (int j = 1; j <= 3; j++) {
        System.out.println("i = " + i +" | j = " + j );
      }
    }
  }
}
