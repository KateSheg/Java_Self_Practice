package additional;
import java.util.Scanner;
public class MiddleCharacters {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    //WRITE YOUR CODE BELOW
    scan.close();
    
    int p = word.length()/2;
    int q = word.length()%2;
    int i1=p+q-1;
    int i2=i1+2-q;
    //int k = p+3-2*q;
    System.out.println("p="+p+" q="+q+ " i1="+i1 +" i2="+i2);
    System.out.println(word.substring(i1,i2));
  }
}
