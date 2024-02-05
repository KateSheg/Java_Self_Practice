package day05.practice;

public class Task6_FINRA {
  public static void main(String[] args) {
    System.out.println(rowFINRA(100));
  }
  
  public static String rowFINRA(int n) {
    String s = "";
    for (int i = 1; i <= n; i++) {
      s += (i % 3 == 0 & i % 5 == 0) ?
              " FINRA " :
              (i % 3 == 0) ?
                      " FIN " :
                      (i % 5 == 0) ?
                              " RA " :
                              " " + i + " ";
    }
    return s;
  }
}
