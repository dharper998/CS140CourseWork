package assignment03;

import java.util.Optional;

public class Question3 {

  /**
 Finds the average bank balance for all the bank accounts in the
 given array.
 Assume accs is not null or empty an no account in accs is null.
 @param accs the array of BankAccount1 elements to examine
 @return an optional object
 @throws IllegalArgumentException if array is null or empty
 */
  public static Optional<Double> averageBankBalance(BankAccount1[] accs) {
    if(accs == null) {
      return Optional.empty();
    } else if(accs.length == 0) {
      return Optional.empty();
    } else {
      double avg = 0.0;
      boolean allNull = true;
      for(BankAccount1 i : accs) {
        if(i != null) {
          allNull = false;
          avg += i.getBalance();
        }
      }
      if(allNull) {
        return Optional.empty();
      }
      avg = avg / accs.length;
      return Optional.of(avg);
    }
  }


  /**
   Find the account in the array parameter that has the small
   the smallest balance and in the case of a tie, return the
   first such account.
   Assume accs is not null or empty an no account in accs is null.
   @param accs the array of BankAccount1 elements to examine
   @return an optional object
   @throws IllegalArgumentException if array is null or empty
   */
  public static Optional<BankAccount1> lowestBankBalance(BankAccount1[] accs) {
    if(accs == null) {
      return Optional.empty();
    } else if(accs.length == 0) {
      return Optional.empty();
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
        return Optional.empty();
      }
      return Optional.of(smallest);
    }
  }


  /**
   In the array accs find the names of the customers and
   return the longest name. If at least two names have the same
   length, return the last one in the array of greatest length.
   @param accs the array of BankAccount1 elements to examine
   @return an optional object
   @throws IllegalArgumentException if array is null or empty
   */
  public static Optional<String> longestName(BankAccount1[] accs) {
    if(accs == null) {
      return Optional.empty();
    } else if(accs.length == 0) {
      return Optional.empty();
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
        return Optional.empty();
      }
      return Optional.of(longest);
    }
  }


  /**
   Finds the average bank balance for all the bank accounts of the
   Customers in the given array.
   Assume accs is not null or empty an no Customer in accs is null
   and no account in any Customer is null.
   @param accs the array of Customer elements to examine
   @return an optional object
   @throws IllegalArgumentException if array is null or empty
   */
  public static Optional<Double> averageCustomerBalance(Customer[] accs) {
    if(accs == null) {
      return Optional.empty();
    } else if(accs.length == 0) {
      return Optional.empty();
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
        return Optional.empty();
      }
      avg = avg / accs.length;
      return Optional.of(avg);
    }
  }


  /**
   Find the Customer in the array parameter that has the largest
   balance in their account field and in the case of a tie, return the
   LAST such account.
   Assume accs is not null or empty an no Customer in accs is null
   and no account in any Customer is null.
   @param accs the array of Customer elements to examine
   @return an optional object
   @throws IllegalArgumentException if array is null or empty
   */
  public static Optional<Customer> greatestCustomerBalance(Customer[] accs) {
    if(accs == null) {
      return Optional.empty();
    } else if(accs.length == 0) {
      return Optional.empty();
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
        return Optional.empty();
      }
      return Optional.of(largest);
    }
  }
}
