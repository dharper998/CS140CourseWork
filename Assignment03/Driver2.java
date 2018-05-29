package assignment03;

public class Driver2 {
  public static void main(String[] args) {
    BankAccount1[] nullAccs = null;
    BankAccount1[] emptyAccs = new BankAccount1[0];
    BankAccount1[] allNullAccs = {null, null, null};
    BankAccount1[] mixAccs = {new BankAccount1("Jane", 1000), null, new BankAccount1("John", 1000)};

    Customer[] nullCustAccs = null;
    Customer[] emptyCustAccs = new Customer[0];
    Customer[] allNullCustAccs = {null, null, null};
    Customer[] mixCustAccs = {new Customer("Andrew", 200), new Customer("Amy", 800), null};

    System.out.println(Question2.averageBankBalance(nullAccs));
    System.out.println(Question2.averageBankBalance(emptyAccs));
    System.out.println(Question2.averageBankBalance(allNullAccs));
    System.out.println(Question2.averageBankBalance(mixAccs));

    System.out.println(Question2.lowestBankBalance(nullAccs));
    System.out.println(Question2.lowestBankBalance(emptyAccs));
    System.out.println(Question2.lowestBankBalance(allNullAccs));
    System.out.println(Question2.lowestBankBalance(mixAccs));

    System.out.println(Question2.longestName(nullAccs));
    System.out.println(Question2.longestName(emptyAccs));
    System.out.println(Question2.longestName(allNullAccs));
    System.out.println(Question2.longestName(mixAccs));

    System.out.println(Question2.averageCustomerBalance(nullCustAccs));
    System.out.println(Question2.averageCustomerBalance(emptyCustAccs));
    System.out.println(Question2.averageCustomerBalance(allNullCustAccs));
    System.out.println(Question2.averageCustomerBalance(mixCustAccs));

    System.out.println(Question2.greatestCustomerBalance(nullCustAccs));
    System.out.println(Question2.greatestCustomerBalance(emptyCustAccs));
    System.out.println(Question2.greatestCustomerBalance(allNullCustAccs));
    System.out.println(Question2.greatestCustomerBalance(mixCustAccs));
  }
}
