package java.LearnClasses.BankAccount;

public class Main {
  public static void main(String[] args) {
    BankAccount acc = new BankAccount(19528756, 100.50d, "Mitchell Wintrow", "me@email.com", "(970) 555-4321");
    // acc.setAccountNumber(19528756);
    // acc.setBalance(100.50d);
    // acc.setCustomerName("Mitchell Wintrow");
    // acc.setEmail("me@email.com");
    // acc.setPhoneNumber("(970)-555-1234");
    // BankAccount acc = new BankAccount();
    // acc.setAccountNumber(19528756);
    // acc.setBalance(100.50d);
    // acc.setCustomerName("Mitchell Wintrow");
    // acc.setEmail("me@email.com");
    // acc.setPhoneNumber("(970)-555-1234");
    System.out.println("account = " + acc.getAccountNumber());
    System.out.println("balance = " + acc.getBalance());
    System.out.println("customer = " + acc.getCustomerName());
    System.out.println("email = " + acc.getEmail());
    System.out.println("phone = " + acc.getPhoneNumber());
    acc.withdrawFunds(50.03);
    System.out.println("after withdraw = " + acc.getBalance());
    acc.depositFunds(657.89);
    System.out.println("after deposit = " + acc.getBalance());
    acc.withdrawFunds(1000.00);

    VIPCustomer vip = new VIPCustomer("Mitchell Wintrow", 1000000.00, "me@vip.com");
    System.out.println("New VIP Customer is " + vip.getName());
    System.out.println(vip.getName() + "'s credit limit is " + vip.getLimit());
    System.out.println(vip.getName() + "'s email is " + vip.getEmail());
  }
}
