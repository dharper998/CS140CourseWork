package assignment03;

public class Question1 {

  /**
 Finds the average bank balance for all the bank accounts in the
 given array.
 Assume accs is not null or empty an no account in accs is null.
 @param accs the array of BankAccount1 elements to examine
 @return the average of the balances of the accounts in accs
 @throws IllegalArgumentException If array is null, empty, or contains all null elements,
 */
  public static double averageBankBalance(BankAccount1[] accs) {
    if(accs == null) {
      throw new IllegalArgumentException("Input should not be null");
    } else if(accs.length == 0) {
      throw new IllegalArgumentException("Input should not be empty");
    } else {
      double avg = 0.0;
      boolean allNull = true;
      for(BankAccount1 i : accs) {
        if(i != null) {
          avg += i.getBalance();
          allNull = false;
        }
      }
      if(allNull) {
        throw new IllegalArgumentException("Input should not contain all null elements");
      }
      avg = avg / accs.length;
      return avg;
    }
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
   @throws IllegalArgumentException If array is null, empty, or contains all null elements,
   */
  public static BankAccount1 lowestBankBalance(BankAccount1[] accs) {
    if(accs == null) {
      throw new IllegalArgumentException("Input should not be null");
    } else if(accs.length == 0) {
      throw new IllegalArgumentException("Input should not be empty");
    } else {
      BankAccount1 smallest = accs[0];
      boolean allNull = true;
      for(BankAccount1 i : accs) {
        if(i != null) {
          allNull = false;
          if(i.getBalance() < smallest.getBalance()) {
            smallest = i;
          }
        }
      }
      if(allNull) {
        throw new IllegalArgumentException("Input should not contain all null elements");
      }

      return smallest;
    }
  }


  /**
   In the array accs find the names of the customers and
   return the longest name. If at least two names have the same
   length, return the last one in the array of greatest length.
   @param accs the array of BankAccount1 elements to examine
   @return the longest name of all the customerNames in
   the customers in accs. If there is a tie for the length,
   return the LAST name.
   @throws IllegalArgumentException If array is null, empty, or contains all null elements,
   */
  public static String longestName(BankAccount1[] accs) {
    if(accs == null) {
      throw new IllegalArgumentException("Input should not be null");
    } else if(accs.length == 0) {
      throw new IllegalArgumentException("Input should not be empty");
    } else {
      String longest = "";
      boolean allNull = true;
      for(BankAccount1 i : accs) {
        if(i != null) {
          allNull = false;
          if(i.getCustomerName().length() >= longest.length()) {
            longest = i.getCustomerName();
          }
        }
      }
      if(allNull) {
        throw new IllegalArgumentException("Input should not contain all null elements");
      }
      return longest;
    }
  }


  /**
   Finds the average bank balance for all the bank accounts of the
   Customers in the given array.
   Assume accs is not null or empty an no Customer in accs is null
   and no account in any Customer is null.
   @param accs the array of Customer elements to examine
   @return the average of the balances of the customer accounts of
   the customers in accs
   @throws IllegalArgumentException If array is null, empty, or contains all null elements,
   */
  public static double averageCustomerBalance(Customer[] accs) {
    if(accs == null) {
      throw new IllegalArgumentException("Input should not be null");
    } else if(accs.length == 0) {
      throw new IllegalArgumentException("Input should not be empty");
    } else {
      double avg = 0.0;
      boolean allNull = true;
      for(Customer i : accs) {
        if(i != null) {
          allNull = false;
          avg += i.getBalance();
        }
      }
      if(allNull) {
        throw new IllegalArgumentException("Input should not contain all null elements");
      }
      avg = avg / accs.length;
      return avg;
    }
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
   @throws IllegalArgumentException If array is null, empty, or contains all null elements,
   */
  public static Customer greatestCustomerBalance(Customer[] accs) {
    if(accs == null) {
      throw new IllegalArgumentException("Input should not be null");
    } else if(accs.length == 0) {
      throw new IllegalArgumentException("Input should not be empty");
    } else {
      Customer largest = accs[0];
      boolean allNull = true;
      for(Customer i : accs) {
        if(i != null) {
          allNull = false;
          if(i.getBalance() >= largest.getBalance()) {
            largest = i;
          }
        }
      }
      if(allNull) {
        throw new IllegalArgumentException("Input should not contain all null elements");
      }
      return largest;
    }
  }
}
