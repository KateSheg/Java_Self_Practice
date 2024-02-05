package day02;

public class Tower {
  public static String seq(String p, int n) {
    String s1 = "";
    for (int i = 1; i <= n; i++) {
      s1 = s1 + p;
    }
    return s1;
  }
  
  public static void BuildRoof(String p, int ve, int de) {
    int top, reg;
    reg = Math.round(de / (2 * ve + 1));
    top = de - 2 * reg * ve;
    int left = (de - top) / 2;
    //System.out.println("top="+top+" reg="+reg+" left="+left);
    System.out.println(seq(" ", left) + seq(p, top));
    for (int i = 2; i <= ve; i++) {
      left = (ve - i + 1) * reg;
      int inside = de - 2 * left - 2 * reg;
      //System.out.println(seq(" ",left)+seq(p,reg)+seq(" ",inside)+seq(p,reg)+"\t left="+left+"\t inside="+inside);
      System.out.println(seq(" ", left) + seq(p, reg) + seq(" ", inside) + seq(p, reg));
    }
    
  }
  
  public static void BuildFloor(String p, int ve, int vs, int de) {
    for (int i = 1; i <= ve - vs; i++) {
      System.out.println(seq(p, de));
    }
    for (int i = 1; i <= vs; i++) {
      System.out.println(p + seq(" ", de - 2) + p);
    }
    
  }
  
  public static void main(String[] args) {
    String sym = "K";
    int ke = 2, ve = 5, vs = 4, de = 29;
    BuildRoof(sym, ve, de);
    for (int i = 1; i <= ke; i++) {
      BuildFloor(sym, ve, vs, de);
    }
    System.out.println(seq(sym, de));
  }
}
