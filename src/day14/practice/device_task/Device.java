package day14.practice.device_task;

public abstract class Device {
  
  private final String brand;
  private final String model;
  private int price;
  private String color;
  private final String size;
  private boolean hasBattery;
  private boolean hasPowerButton;
  
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_WHITE = "\u001B[37m";
  
  public Device(String brand, String model, int price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
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
    if (price>=0) this.price = price;
    setColor(color);
    if (isNotNullEmptyBlank(model)) this.size = size;
    else {
      this.size = "";
      System.out.println(inColor("Incorrect value of size","red"));
      System.exit(1);
    }
    setHasBattery(hasBattery);
    setHasPowerButton(hasPowerButton);
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
  
  public void setHasBattery(boolean hasBattery) {
    this.hasBattery = hasBattery;
  }
  
  public void setHasPowerButton(boolean hasPowerButton) {
    this.hasPowerButton = hasPowerButton;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public String getModel() {
    return model;
  }
  
  public int getPrice() {
    return price;
  }
  
  public String getColor() {
    return color;
  }
  
  public String getSize() {
    return size;
  }
  
  public boolean getHasBattery() {
    return hasBattery;
  }
  
  public boolean getHasPowerButton() {
    return hasPowerButton;
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
  
  public abstract void turnOn();

  public abstract void turnOff();
  
  @Override
  public String toString() {
    return getClass().getSimpleName() + " {" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", price=" + price +
            ", color='" + color + '\'' +
            ", size='" + size + '\'' +
            ", hasBattery=" + hasBattery +
            ", hasPowerButton=" + hasPowerButton +
            '}';
  }
}
