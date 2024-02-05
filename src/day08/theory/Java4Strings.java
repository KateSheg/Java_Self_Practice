package day08.theory;

public class Java4Strings {
  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "Java";
    String s3 = new String("Java");
    String s4 = new String("Java");
    boolean b = false;
    System.out.println("s1.equals(s2) \t= " + s1.equals(s2));
    b = s1==s2;
    System.out.println("s1==s2 \t\t\t= " + b);
    System.out.println("s2.equals(s3) \t= " + s2.equals(s3));
    b = s2==s3;
    System.out.println("s2==s3 \t\t\t= " + b);
    System.out.println("s3.equals(s4) \t= " + s3.equals(s4));
    b = s3==s4;
    System.out.println("s3==s4 \t\t\t= " + b);
  }
}
