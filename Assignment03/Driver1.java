package assignment03;

public class Driver1 {
  public static void main(String[] args) {
    BankAccount1[] nullAccs = null;
    BankAccount1[] emptyAccs = new BankAccount1[0];
    BankAccount1[] allNullAccs = {null, null, null};
    BankAccount1[] mixAccs = {new BankAccount1("Jane", 1000), null, new BankAccount1("John", 1000)};

    Customer[] nullCustAccs = null;
    Customer[] emptyCustAccs = new Customer[0];
    Customer[] allNullCustAccs = {null, null, null};
    Customer[] mixCustAccs = {new Customer("Andrew", 200), new Customer("Amy", 800), null};

    try {
      System.out.println(Question1.averageBankBalance(nullAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.averageBankBalance(emptyAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.averageBankBalance(allNullAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }


    try {
      System.out.println(Question1.averageBankBalance(mixAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.lowestBankBalance(nullAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.lowestBankBalance(emptyAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.lowestBankBalance(allNullAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.lowestBankBalance(mixAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.longestName(nullAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.longestName(emptyAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.longestName(allNullAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.longestName(mixAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.averageCustomerBalance(nullCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.averageCustomerBalance(emptyCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.averageCustomerBalance(allNullCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.averageCustomerBalance(mixCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.greatestCustomerBalance(nullCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.greatestCustomerBalance(emptyCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.greatestCustomerBalance(allNullCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(Question1.greatestCustomerBalance(mixCustAccs));
    } catch(IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
