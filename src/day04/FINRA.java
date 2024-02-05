package day04;

public class FINRA {
  public static void main(String[] args) {
    int n = 12;
    String result = (n % 3 == 0 & n % 5 == 0) ? "FINRA" : (n % 3 == 0) ? "FIN" : (n % 5 == 0) ? "RA" : "";
    System.out.println(result);
  }
}
