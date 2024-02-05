package self_practice.atm;

import java.util.Scanner;

public class ATM {
  
  public int pinNumber;
  public int balance;
  
  public void setValue(int pinNumber, int balance) {
    this.pinNumber = pinNumber;
    this.balance = balance;
  }
  
  public void showBalance() {
    System.out.println("\nAvailable balance is $" + this.balance );
  }
  
  public void depositMoney() {
    System.out.print("\nEnter the amount to deposit: $");
    Scanner kb = new Scanner(System.in);
    int sum = kb.nextInt();
    if (sum <= 0) {
      System.err.println("\nDepositing amount cannot be zero or negative, please try again later.");
      System.exit(5);
    }
    else {
      this.balance += sum;
      System.out.println("\nYour new available balance is $" + this.balance);
    }
  }
  
  public void withdrawMoney() {
    System.out.print("\nEnter the amount to withdraw: $");
    Scanner kb = new Scanner(System.in);
    int sum = kb.nextInt();
    if (sum <= 0) {
      System.err.println("\nCannot withdraw zero or negative amount, please try again later.");
      System.exit(6);
    }
    else if (sum > this.balance) {
      System.err.println("\nInsufficient funds. Withdrawal failed.");
      System.exit(7);
    }
    else {
      this.balance -= sum;
      System.out.println("\nYour new available balance is $" + this.balance);
    }
  }
  
}
