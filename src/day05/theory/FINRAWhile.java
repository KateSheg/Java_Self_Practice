package day05.theory;

public class FINRAWhile {
  public static void main(String[] args) {
    rowFINRA(20);
  }
  
  public static void rowFINRA(int n) {
    int i = 1;
    String s = "";
    while (i <= n) {
      s += (i % 3 == 0 & i % 5 == 0) ?
              " FINRA " :
              (i % 3 == 0) ?
                " FIN " :
                (i % 5 == 0) ?
                  " RA " :
                  " " + i + " ";
      i++;
    }
    System.out.println(s);
  }
}
