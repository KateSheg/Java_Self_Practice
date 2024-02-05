package day09.practice;

public class MoveTheZeros {
  public static void main(String[] args) {
    int[] array = {10, 0, 5, 0, 1, 0};
    for (int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    System.out.println("---------------------");
    for (int i=0; i<array.length; i++) {
      for (int j=i+1; j<array.length; j++) {
        if (array[i]==0 && array[j]!=0) {
          array[i]=array[j];
          array[j]=0;
          break;
        }
      }
    }
    
    for (int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
