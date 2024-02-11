package day13.practice.state;

public class StateClients {
  public static void main(String[] args) {
    State penn = new State("Pennsylvania", "PA", "democratic", "governer_penn", "senator_penn", 20_000_000);
    System.out.println(penn);
  }
}
