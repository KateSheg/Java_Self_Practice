package additional;

import java.util.Scanner;

public class RoomReservationApplication {
  public static void main(String[] args) {
    int[] bedPrice = {100, 120, 160};
    String[] bed = {"Single", "Queen", "King"};
    double tax = 0.08;
    double seniorDiscount = 0.1;
    double veteranDiscount = 0.15;
    System.out.println("Welcome to the CYDEO Skyline Inn!");
    
    Scanner kb = new Scanner(System.in);
    boolean needRoom = true;
    String answer = "";
    while (needRoom) {
      System.out.print("\nWould you like to reserve a room? (Yes/No) ");
      answer = kb.nextLine();
      switch (answer.toLowerCase()) {
        case "yes" -> {
          reservation(bed, bedPrice, tax, seniorDiscount, veteranDiscount);
          needRoom = false;
        }
        case "no" -> {
          System.out.println("\nHave a wonderful day!");
          needRoom = false;
        }
        default -> {
          System.out.println("\nPlease, re-enter.");
        }
      }
    }
  }
  
  public static void reservation(String[] bed, int[] bedPrice, double taxDiscount, double seniorDiscount, double veteranDiscount) {
    double grandTotal = 0;
    Scanner kb = new Scanner(System.in);
    
    System.out.println();
    String firstName = "";
    boolean needAskingAboutFirstName = true;
    while (needAskingAboutFirstName) {
      System.out.println("Please enter your first name:");
      firstName = kb.nextLine();
      if (!firstName.isEmpty()) needAskingAboutFirstName = false;
    }
    
    String lastName = "";
    boolean needAskingAboutLastName = true;
    while (needAskingAboutLastName) {
      System.out.println("Please enter your last name:");
      lastName = kb.nextLine();
      if (!lastName.isEmpty()) needAskingAboutLastName = false;
    }
    
    boolean needAge = true;
    Integer ageNumber = 0;
    while (needAge) {
      System.out.println("Please enter your age:");
      String age = kb.nextLine();
      if (isNumeric(age)) {
        ageNumber = Integer.parseInt(age);
        needAge = false;
      }
    }
    int seniorNumber = 0;
    if (ageNumber >= 60) seniorNumber = 1;
    
    System.out.println("\nHere are our available rooms and their prices:");
    for (int i = 0; i < bedPrice.length; i++) {
      System.out.println(bed[i] + " Bed\t$" + bedPrice[i]);
    }
    
    int roomNumber = -1;
    boolean needAskingAboutRoom = true;
    while (needAskingAboutRoom) {
      System.out.println("\nWhich room would you like to reserve? (King/Queen/Single)");
      String roomEntered = kb.nextLine();
      //System.out.println("roomEntered.isEmpty = " + roomEntered.isEmpty());
      for (int i = 0; i < bed.length; i++) {
        if (roomEntered.toLowerCase().equals(bed[i].toLowerCase())) {
          roomNumber = i;
          needAskingAboutRoom = false;
          break;
        }
      }
      if (needAskingAboutRoom) System.out.println("Please re-enter.");
    }
    
    boolean needNights = true;
    Integer nightsNumber = 0;
    while (needNights) {
      System.out.println("How many nights would you like to stay?");
      String nightsEntered = kb.nextLine();
      if (isNumeric(nightsEntered)) {
        nightsNumber = Integer.parseInt(nightsEntered);
        needNights = false;
      } else System.out.println("Please re-enter.");
    }
    
    boolean needAskingAboutVeteran = true;
    int veteranNumber = 0;
    while (needAskingAboutVeteran) {
      System.out.println("Are you a veteran? (Yes/No)");
      String veteran = kb.nextLine();
      switch (veteran.toLowerCase()) {
        case "yes" -> {
          veteranNumber = 1;
          needAskingAboutVeteran = false;
        }
        case "no" -> {
          veteranNumber = 0;
          needAskingAboutVeteran = false;
        }
        default -> System.out.println("Please re-enter.");
      }
    }
    
    //grandTotal = 0;
    double roomFee = bedPrice[roomNumber] * nightsNumber;
    double tax = roomFee * taxDiscount * (1 - veteranDiscount * veteranNumber) * (1 - seniorDiscount * seniorNumber);
    grandTotal = roomFee + tax;
    System.out.println("\nHello, " + firstName + " " + lastName.toUpperCase() + ", you have selected " + bed[roomNumber] +
            " Bed room for " + nightsNumber + " nights to stay.\nRoom fee: $" +
            roomFee + "\nTax is: $" + tax + "\nYour grand total is: $" + grandTotal);
    //return grandTotal;
  }
  
  public static boolean isNumeric(String strNum) {
    boolean f = true;
    if (strNum == null) {
      f = false;
    } else {
      for (int i = 0; i < strNum.length(); i++) {
        if (!Character.isDigit(strNum.charAt(i))) f = false;
      }
      try {
        double d = Double.parseDouble(strNum);
      } catch (NumberFormatException nfe) {
        f = false;
      }
    }
    return f;
  }
}
