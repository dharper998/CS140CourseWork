package assignment02;

public class Driver2{
  public static void main(String[] args){
    Bank bank = new Bank();
    bank.createTestAccounts();
    System.out.println("Interest Owed: " +bank.computeInterestToPay(2));
  }
}
