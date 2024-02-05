package day07.practice;

public class MyInfo {
  public int age;
  public String gender;
  public String fullName;
  public long phoneNumber;
  public int zipCode;
  public String schoolName;
  public String city;
  public String state;
  public int buildingNumber;
  public String streetName;
  
  public String toString() {
    return fullName + "\n" +
            age + "\n" +
            gender + "\n" +
            phoneNumber + "\n" +
            "Address: \n" +
            buildingNumber + " " + streetName + "\n" +
            city + ", " + state + " " + zipCode + "\n";
  }
}
