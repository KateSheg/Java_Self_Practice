package additional;
import java.util.Scanner;

public class BurgerOrChicken {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String order = s.next();
    
    //WRITE YOUR CODE BELOW:
    s.close();
    //System.out.println(order + " & burger");
    if (order.equals("burger")) System.out.println("Your total is $12.55");
    else if (order.equals("chicken")) System.out.println("Your total is $9.75");
  }
}
