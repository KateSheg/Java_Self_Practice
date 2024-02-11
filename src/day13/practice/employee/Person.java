package day13.practice.employee;

public class Person {
  
  private String name;
  private int age;
  
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";
  private static final String ANSI_YELLOW = "\u001B[33m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_PURPLE = "\u001B[35m";
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_WHITE = "\u001B[37m";
  
  public Person(String name, int age) {
    setName(name);
    setAge(age);
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public void setName(String name) {
    if (isNotNullEmptyBlank(name)) this.name = name;
  }
  
  public void setAge(int age) {
    if (age>=0) this.age = age;
  }
  
  public boolean isNotNullEmptyBlank(String s) {
    if (s.isBlank() || s.isEmpty() || s==null || s.trim().isEmpty()) return false;
    else return true;
  }
  
  @Override
  public String toString() {
    return "\n" + this.getClass().getSimpleName() +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
  
  public static final String startColor(String newColor){
    String color;
    switch (newColor.trim().toLowerCase()){
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
  
  public void work() {
    System.out.println("\n" + getName() + " " + getAge() + " affords not to work");
  }
}
