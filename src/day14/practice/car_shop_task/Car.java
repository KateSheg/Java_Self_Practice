package day14.practice.car_shop_task;

public class Car {
  private final String brand;
  private final String model;
  private final int year;
  private int price;
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
  
  public Car(String brand, String model, String color, int year, int price) {
    if (isNotNullEmptyBlank(brand)) this.brand = brand;
    else {
      this.brand = "";
      System.out.println(inColor("Incorrect value of brand","red"));
      System.exit(1);
    }
    if (isNotNullEmptyBlank(model)) this.model = model;
    else {
      this.model = "";
      System.out.println(inColor("Incorrect value of brand","red"));
      System.exit(1);
    }
    if (year>=1886) this.year = year;
    else {
      this.year = 0;
      System.out.println(inColor("Incorrect value of year, must be >=1886","red"));
      System.exit(1);
    }
    setPrice(price);
    setColor(color);
  }
  
  public void setPrice(int price) {
    if (price>=0) this.price = price;
    else {
      System.out.println(inColor("Incorrect value of price, must not be negative","red"));
      System.exit(1);
    }
  }
  
  public void setColor(String color) {
    if (isNotNullEmptyBlank(color)) this.color = color;
    else {
      System.out.println(inColor("Incorrect color","red"));
      System.exit(1);
    }
  }
  
  public String getBrand() {
    return brand;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getYear() {
    return year;
  }
  
  public int getPrice() {
    return price;
  }
  
  public String getColor() {
    return color;
  }
  
  public boolean isNotNullEmptyBlank(String s) {
    if (s.isBlank() || s.isEmpty() || s==null || s.trim().isEmpty()) return false;
    else return true;
  }
  
  public String inColor(String message, String color) {
    String colorCode;
    switch (color.trim().toLowerCase()) {
      case "blue" -> colorCode = ANSI_BLUE;
      case "black" -> colorCode =  ANSI_BLACK;
      case "red" -> colorCode =  ANSI_RED;
      case "green" -> colorCode =  ANSI_GREEN;
      case "yellow" -> colorCode =  ANSI_YELLOW;
      case "purple" -> colorCode =  ANSI_PURPLE;
      case "cyan" -> colorCode =  ANSI_CYAN;
      case "while" -> colorCode =  ANSI_WHITE;
      default -> colorCode = ANSI_RESET;
    }
    return colorCode + message + ANSI_RESET;
  }
  
  @Override
  public String toString() {
    return getClass().getSimpleName() +
            " model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", year=" + year +
            ", price=" + price;
  }
}
