package assignment02;

public class Question1 {

  /**
 Finds the average bank balance for all the bank accounts in the
 given array.
 Assume accs is not null or empty an no account in accs is null.
 @param accs the array of BankAccount1 elements to examine
 @return the average of the balances of the accounts in accs
 */
  public static double averageBankBalance(BankAccount1[] accs) {
    double avg = 0.0;
    for(BankAccount1 i : accs) {
      avg += i.getBalance();
    }
    avg = avg / accs.length;
    return avg;
  }


  /**
   Find the account in the array parameter that has the small
   the smallest balance and in the case of a tie, return the
   first such account.
   Assume accs is not null or empty an no account in accs is null.
   @param accs the array of BankAccount1 elements to examine
   @return the bank account in the array accs that has the
   smallest balance. If there is more than one, then return the
   first of them.
   */
  public static BankAccount1 lowestBankBalance(BankAccount1[] accs) {
    BankAccount1 smallest = accs[0];
    for(BankAccount1 i : accs) {
      if(i.getBalance() < smallest.getBalance()) {
        smallest = i;
      }
    }
    return smallest;
  }


  /**
   In the array accs find the names of the customers and
   return the longest name. If at least two names have the same
   length, return the last one in the array of greatest length.
   @param accs the array of BankAccount1 elements to examine
   @return the longest name of all the customerNames in
   the customers in accs. If there is a tie for the length,
   return the LAST name.
   */
  public static String longestName(BankAccount1[] accs) {
    String longest = "";
    for(BankAccount1 i : accs) {
      if(i.getCustomerName().length() >= longest.length()) {
        longest = i.getCustomerName();
      }
    }
    return longest;

  }


  /**
   Finds the average bank balance for all the bank accounts of the
   Customers in the given array.
   Assume accs is not null or empty an no Customer in accs is null
   and no account in any Customer is null.
   @param accs the array of Customer elements to examine
   @return the average of the balances of the customer accounts of
   the customers in accs
   */
  public static double averageCustomerBalance(Customer[] accs) {
    double avg = 0.0;
    for(Customer i : accs) {
      avg += i.getBalance();
    }
    avg = avg / accs.length;
    return avg;
  }


  /**
   Find the Customer in the array parameter that has the largest
   balance in their account field and in the case of a tie, return the
   LAST such account.
   Assume accs is not null or empty an no Customer in accs is null
   and no account in any Customer is null.
   @param accs the array of Customer elements to examine
   @return the Customer with the largest bank account in the array accs.
   If there is more than one, then return the last of them.
   */
  public static Customer greatestCustomerBalance(Customer[] accs) {
    Customer largest = accs[0];
    for(Customer i : accs) {
      if(i.getBalance() >= largest.getBalance()) {
        largest = i;
      }
    }
    return largest;
  }
}
