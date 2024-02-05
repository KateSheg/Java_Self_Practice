package day03;

import java.util.Collections;
import java.util.List;

public class KilosToPounds {
  public static void main(String[] args) {
    double kg, lb;
    kg = 10.5;
    lb = 2.2 * kg;
    /*List<Integer> a = List.of(1, 2, 3);
    a.stream().filter(e -> {
      System.out.println(e);
      return e > 2;
    })
    
    .skip(2)
    
    .forEach(e -> {
      System.out.print("");
      System.out.println(e);
    });*/
    System.out.println(kg + " kilos is equal to " + lb + " pounds");
  }
}
