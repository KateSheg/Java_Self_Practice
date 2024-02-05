package day05.theory;

public class FIZZBUZZ_pattern {
  public static void main(String[] args) {
    rowFIZZBUZZ(20);
  }
  
  public static void rowFIZZBUZZ(int n) {
    String s = "";
    for (int i = 1; i <= n; i++) {
      s += (i % 3 == 0 & i % 5 != 0) ?
              " FIZZ " :
              (i % 5 == 0 & i % 3 != 0) ?
                " BUZZ " :
                (i % 5 == 0 & i % 3 == 0) ?
                  " FIZZBUZZ " :
                  " " + i + " " ;
 ;   }
    System.out.println(s);
  }
}
