package day11.practice;

public class CydeoStudent {
  public String name;
  public int age;
  public int id;
  public char grade;
  public int batchNumber;
  public String groupNumber;
  public static final String SCHOOL_NAME = "CYDEO";
  public static String programmingLanguage = "Java";
  
  public CydeoStudent(String name, int id) {
    this.name = name;
    this.id = id;
  }
  
  public CydeoStudent(String name, int age, int id) {
    this(name, id);
    this.age = age;
  }
  
  public CydeoStudent(String name, int age, int id, String groupNumber) {
    this(name, age, id);
    this.groupNumber = groupNumber;
  }
  
  public CydeoStudent(String name, int id, char grade) {
    this(name, id);
    this.grade = grade;
  }
  
  public CydeoStudent(String name, int id, char grade, int batchNumber, String groupNumber) {
    this(name, id);
    this.grade = grade;
    this.batchNumber = batchNumber;
    this.groupNumber = groupNumber;
  }
  
  public void study() {
    System.out.println(name + " is studying.");
  }
  
  public void attendClass() {
    System.out.println(name + " is attending the live class.");
  }
  
  public void printSchoolName() {
    System.out.println(SCHOOL_NAME + " school");
  }
  
  public void printProgLang() {
    System.out.println(programmingLanguage + " is a programming language.");
  }
  
  @Override
  public String toString() {
    return "CydeoStudent " +
            "name='" + name + '\'' +
            ", age=" + age +
            ", id=" + id +
            ", grade=" + grade +
            ", batchNumber=" + batchNumber +
            ", groupNumber='" + groupNumber;
  }
  
  public static void main(String[] args) {
    CydeoStudent c1 = new CydeoStudent("Kate Shegidevich", 43, 348940, "s10");
    System.out.println(c1);
    c1.attendClass();
    c1.printProgLang();
    c1.study();
    c1.printSchoolName();
  }
}
