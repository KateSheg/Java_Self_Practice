package day11.theory;

public class Light {
  public int noOfWatts;
  public boolean indicator;
  public String location;
  
  public Light () {
    System.out.println("Returning from costructor #1");
  }
  
  public Light (int noOfWatts, boolean indicator) {
    this();
    System.out.println("Returning from costructor #2");
    this.noOfWatts = noOfWatts;
    this.indicator = indicator;
  }
  
  public Light (int noOfWatts, boolean indicator, String location) {
    this(noOfWatts, indicator);
    System.out.println("Returning from costructor #3");
    this.location = location;
  }
  
  @Override
  public String toString() {
    return "Light{" +
            "noOfWatts=" + noOfWatts +
            ", indicator=" + indicator +
            ", location='" + location + '\'' +
            '}';
  }
  
  public static void main(String[] args) {
    Light l1 = new Light();
    Light l2 = new Light(100, true);
    Light l3 = new Light(150, false, "Philadelphia");
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
  }
}
