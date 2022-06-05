package java.LearnClasses.BankAccount;

public class VIPCustomer {
  private String name;
  private double limit;
  private String email;

  public VIPCustomer() {
    this("Default Name", 1000.00, "Default Email");
  }

  public VIPCustomer(String name, String email) {
    this(name, 1000.00, email);
  }

  public VIPCustomer(String name, double limit, String email) {
    this.name = name;
    this.limit = limit;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public double getLimit() {
    return this.limit;
  }

  public String getEmail() {
    return this.email;
  }
}
