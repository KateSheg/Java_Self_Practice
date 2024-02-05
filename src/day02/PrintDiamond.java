package day02;

public class PrintDiamond {
  
  public static String seq(String p, int n){
    String s1 = "";
    for (int i=1; i<=n; i++){
      s1 = s1 + p;
    }
    return s1;
  }
  
  public static String seq2(int l, String k){
    String s1 = "";
    for (int i=1; i<=11; i++){
      s1 = s1 + " ";
    }
    return s1;
  }
  
  public static void main(String[] args) {
    String[] Symb = {"","^","/","-","\\","","v"};
    /*char ch1 = '^';
    int asciivalue1 = ch1;
    char ch2 = 'v';
    int asciivalue2 = ch2;
    char ch3 = '/';
    int asciivalue3 = ch3;
    char ch4 = '\\';
    int asciivalue4 = ch4;
    char ch5 = '-';
    int asciivalue5 = ch5;
    System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
    System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
    System.out.println("The ASCII value of " + ch3 + " is: " + asciivalue3);
    System.out.println("The ASCII value of " + ch4 + " is: " + asciivalue4);
    System.out.println("The ASCII value of " + ch5 + " is: " + asciivalue5);
    String s = "";
    for (int i = 2; i <= 5; i++) {
      s = "";
      for (int j = 1; j <= 5-i+1; j++) {
        s = s + " ";
      }
    
      for (int j = 1; j <= 2*(i-1)-1; j++) {
        s = s + " ";
      }
    System.out.println(s);
    
  }*/
    String s, spr;
    
    int iftop, iftoptop, left, inside, n=33;
    Symb[3]=seq("",1);
    for (int i = 1; i <= n; i++) {
      s = "";
      spr=" ";
      iftop= (int) Math.signum((n+1)/2-i);
      iftoptop = 1;
      
      //iftop = i==1 ? 2 : i==n ? 3 : i==n/2+1 ? 0 : 1;
      if (i==1 ) {
        iftoptop=2;
      }
      else if (i==n) {
        iftoptop=3;
      }
      else if (i==n/2+1) {
        iftoptop=0;
        spr="-";
      }
      left = Math.abs(n/2-i+1)-1;
      inside = 2*(n/2-left -1)-1;
      s = seq(spr,left) + Symb[3-iftop*iftoptop] + seq(spr,inside) + Symb[3+iftop*iftoptop];
      System.out.println(s);
      
    }
    
  }
}
