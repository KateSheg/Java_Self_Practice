package day07.practice;

public class AddressClients {
  public static void main(String[] args) {
    Address a1 = new Address();
    a1.buildingNumber = 2632;
    a1.street = "Belmont Ave";
    a1.city = "Abington";
    a1.state = "PA";
    a1.zipCode = "19001";
    System.out.println(a1);
  }
}
