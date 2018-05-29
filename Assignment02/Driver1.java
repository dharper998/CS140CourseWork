package assignment02;

public class Driver1 {
  public static void main(String[] args) {
    BankAccount1[] accs = new BankAccount1[4];
    accs[0] = new BankAccount1("Jane", 1000);
    accs[1] = new BankAccount1("John", 1000);
    accs[2] = new BankAccount1("James", 1500);
    accs[3] = new BankAccount1("Jones", 2500);

    System.out.println("Average Account Balance: " + Question1.averageBankBalance(accs));
    System.out.println("Smallest Account Balance: " + Question1.lowestBankBalance(accs));
    System.out.println("Longest Name: " + Question1.longestName(accs));

    Customer[] custAccs = new Customer[4];
    custAccs[0] = new Customer("Andrew", 200);
    custAccs[1] = new Customer("Amy", 800);
    custAccs[2] = new Customer("Arnold", 1000);
    custAccs[3] = new Customer("Allie", 1000);

    System.out.println("Average Customer Balance: " + Question1.averageCustomerBalance(custAccs));
    System.out.println("Greatest Customer Balance: " + Question1.greatestCustomerBalance(custAccs));
  }
}
