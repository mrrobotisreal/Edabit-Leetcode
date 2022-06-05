package java.LearnClasses.BankAccount;

public class BankAccount {
  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public BankAccount() {
    this(1234567, 2.50, "Default Name", "Default Email", "Default Phone Number");
    System.out.println("Empty Constructor Called!");
  }

  public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(int account) {
    this.accountNumber = account;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double deposit) {
    this.balance = deposit;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String name) {
    this.customerName = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void depositFunds(double deposit) {
    System.out.println("balance before: " + this.balance);
    this.balance += deposit;
    System.out.println("balance after: " + this.balance);
  }

  public void withdrawFunds(double withdraw) {
    System.out.println("balance before withdraw: " + this.balance);
    if (withdraw > this.balance) {
      System.out.println("Insufficient Funds");
      return;
    } else {
      this.balance -= withdraw;
      System.out.println("balance after withdraw: " + this.balance);
    }
  }
}
