package self_practice.atm;

import java.util.Scanner;

public class ATMSimulation {
  
  public static void main(String[] args) {
    ATM atm = new ATM();
    atm.setValue(1234, 1300);
    System.out.print("Please, enter your PIN code: ");
    Scanner kb = new Scanner(System.in);
    final int max_number_of_attempts = 2;
    int attemptNumber = 1;
    int pinTrial = kb.nextInt();

    while (attemptNumber <= max_number_of_attempts & atm.pinNumber != pinTrial) {
      System.err.print("\nIncorrect PIN code, please re-enter: ");
      attemptNumber++;
      pinTrial = kb.nextInt();
    }
    
    if (attemptNumber == max_number_of_attempts+1 & atm.pinNumber != pinTrial) {
      System.err.println("\nYour card is locked. Please contact your local bank.");
      System.exit(3);
    }
    
    boolean readyToExit = false;
    while (readyToExit==false) {
      System.out.println("\nSelect one of the options: (1/2/3)" +
              "\n1. Display the available balance" +
              "\n2. Deposit Money" +
              "\n3. Withdraw Money");
      int option = kb.nextInt();
      switch (option) {
        case 1 -> atm.showBalance();
        case 2 -> atm.depositMoney();
        case 3 -> atm.withdrawMoney();
        default -> {
          System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
          //System.exit(2);
          //break;
          readyToExit = true;
        }
      }
      //kb.close();
    }
  }
  
}
