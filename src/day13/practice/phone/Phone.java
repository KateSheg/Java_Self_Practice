package day13.practice.phone;

public class Phone {
  
  private String brand;
  private String model;
  private String size;
  private double price;
  private String color;
  
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_WHITE = "\u001B[37m";
  
  public Phone(String brand, String model, double price, String size, String color) {
    setBrand(brand);
    setModel(model);
    setPrice(price);
    setSize(size);
    setColor(color);
  }
  
  public String getBrand() {
    return brand;
  }
  
  public void setBrand(String brand) {
    if (isNotNullEmptyBlank(brand)) this.brand = brand;
    else {
      System.err.println("Incorrect brand, re-enter.");
      System.exit(1);
    }
  }
  
  public String getModel() {
    return model;
  }
  
  public void setModel(String model) {
    if (isNotNullEmptyBlank(brand)) this.model = model;
    else {
      System.err.println("Incorrect model, re-enter.");
      System.exit(1);
    }
  }
  
  public String getSize() {
    return size;
  }
  
  public Phone setSize(String size) {
    if (isNotNullEmptyBlank(brand)) this.size = size;
    else {
      System.err.println("Incorrect size, re-enter.");
      System.exit(1);
    }
    return this;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    if (price>=0) this.price = price;
    else {
      System.err.println("Incorrect price, re-enter.");
      System.exit(1);
    }
  }
  
  public String getColor() {
    return color;
  }
  
  public Phone setColor(String color) {
    this.color = color;
    return this;
  }
  
   public static final String startColor(String newColor){
    //private static final String ANSI_RESET = "\u001B[0m";
    String color;
    switch (newColor){
      case "blue" -> color = ANSI_BLUE;
      case "black" -> color =  ANSI_BLACK;
      case "red" -> color =  ANSI_RED;
      case "green" -> color =  ANSI_GREEN;
      case "yellow" -> color =  ANSI_YELLOW;
      case "purple" -> color =  ANSI_PURPLE;
      case "cyan" -> color =  ANSI_CYAN;
      case "while" -> color =  ANSI_WHITE;
      default -> color = ANSI_RESET;
    }
    return color;
  }
  
  public boolean isNotNullEmptyBlank(String s) {
    if (s.isBlank() || s.isEmpty() || s==null) return false;
    else return true;
  }
  
  public void call(String PhoneNumber) {
    System.out.println(this.getClass().getSimpleName() + " is calling the number " + PhoneNumberFormatted(PhoneNumber));
  }
  
  public void text(String PhoneNumber) {
    System.out.println(this.getClass().getSimpleName() + " is texting to the number " + PhoneNumberFormatted(PhoneNumber));
  }
  
  public void faceTime(String PhoneNumber) {
    System.out.println(this.getClass().getSimpleName() + " is facetiming with the number " + PhoneNumberFormatted(PhoneNumber));
  }
  
  @Override
  public String toString() {
    return "\n" + this.getClass().getSimpleName() + ": "  +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", size='" + size + '\'' +
            ", price=" + price +
            ", color='" + color + '\'';
  }
  
  public String PhoneNumberFormatted(String PhoneNumber){
    return "(" + PhoneNumber.substring(0,3) + ") " + PhoneNumber.substring(3,6) + "-" +
            PhoneNumber.substring(6,10);
  }
  
  public String displayInfo(String m, String s, double p, String c) {
    return "\n" + this.getClass().getSimpleName() +
            ": model='" + m + '\'' +
            ", size='" + s + '\'' +
            ", price=" + p +
            ", color='" + c + '\'';
  }
  
//  public static String startColor(String newColor){
//    return get;
//  }
}


