package assignment03;

import java.util.Optional;

public class Driver3 {
  public static void main(String[] args) {
    BankAccount1[] nullAccs = null;
    BankAccount1[] emptyAccs = new BankAccount1[0];
    BankAccount1[] allNullAccs = {null, null, null};
    BankAccount1[] mixAccs = {new BankAccount1("Jane", 1000), null, new BankAccount1("John", 1000)};

    Customer[] nullCustAccs = null;
    Customer[] emptyCustAccs = new Customer[0];
    Customer[] allNullCustAccs = {null, null, null};
    Customer[] mixCustAccs = {new Customer("Andrew", 200), new Customer("Amy", 800), null};

    Optional<Double> opt1 = Question3.averageBankBalance(nullAccs);
    if(opt1.isPresent()) {
      double result1 = opt1.get();
      System.out.println(result1);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt2 = Question3.averageBankBalance(emptyAccs);
    if(opt2.isPresent()) {
      double result2 = opt2.get();
      System.out.println(result2);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt16 = Question3.averageBankBalance(allNullAccs);
    if(opt16.isPresent()) {
      double result16 = opt16.get();
      System.out.println(result16);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt3 = Question3.averageBankBalance(mixAccs);
    if(opt3.isPresent()) {
      double result3 = opt3.get();
      System.out.println(result3);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<BankAccount1> opt4 = Question3.lowestBankBalance(nullAccs);
    if(opt4.isPresent()) {
      BankAccount1 result4 = opt4.get();
      System.out.println(result4);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<BankAccount1> opt5 = Question3.lowestBankBalance(emptyAccs);
    if(opt5.isPresent()) {
      BankAccount1 result5 = opt5.get();
      System.out.println(result5);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<BankAccount1> opt17 = Question3.lowestBankBalance(allNullAccs);
    if(opt17.isPresent()) {
      BankAccount1 result17 = opt17.get();
      System.out.println(result17);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<BankAccount1> opt6 = Question3.lowestBankBalance(mixAccs);
    if(opt6.isPresent()) {
      BankAccount1 result6 = opt6.get();
      System.out.println(result6);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<String> opt7 = Question3.longestName(nullAccs);
    if(opt7.isPresent()) {
      String result7 = opt7.get();
      System.out.println(result7);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<String> opt8 = Question3.longestName(emptyAccs);
    if(opt8.isPresent()) {
      String result8 = opt8.get();
      System.out.println(result8);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<String> opt18 = Question3.longestName(allNullAccs);
    if(opt18.isPresent()) {
      String result18 = opt18.get();
      System.out.println(result18);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<String> opt9 = Question3.longestName(mixAccs);
    if(opt9.isPresent()) {
      String result9 = opt9.get();
      System.out.println(result9);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt10 = Question3.averageCustomerBalance(nullCustAccs);
    if(opt10.isPresent()) {
      Double result10 = opt10.get();
      System.out.println(result10);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt11 = Question3.averageCustomerBalance(emptyCustAccs);
    if(opt11.isPresent()) {
      Double result11 = opt11.get();
      System.out.println(result11);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt19 = Question3.averageCustomerBalance(allNullCustAccs);
    if(opt19.isPresent()) {
      Double result19 = opt19.get();
      System.out.println(result19);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Double> opt12 = Question3.averageCustomerBalance(mixCustAccs);
    if(opt12.isPresent()) {
      Double result12 = opt12.get();
      System.out.println(result12);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Customer> opt13 = Question3.greatestCustomerBalance(nullCustAccs);
    if(opt13.isPresent()) {
      Customer result13 = opt13.get();
      System.out.println(result13);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Customer> opt14 = Question3.greatestCustomerBalance(emptyCustAccs);
    if(opt14.isPresent()) {
      Customer result14 = opt14.get();
      System.out.println(result14);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Customer> opt20 = Question3.greatestCustomerBalance(allNullCustAccs);
    if(opt20.isPresent()) {
      Customer result20 = opt20.get();
      System.out.println(result20);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

    Optional<Customer> opt15 = Question3.greatestCustomerBalance(mixCustAccs);
    if(opt15.isPresent()) {
      Customer result15 = opt15.get();
      System.out.println(result15);
    } else {
      System.out.println("The input was null, empty, or contained all null elements");
    }

  }
}
