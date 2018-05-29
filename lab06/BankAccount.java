package lab06;

public class BankAccount {
	private double balance;
	private int idNum;
	private static int numAccounts = 0;
	
	public BankAccount(double balance) {
		if(balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
		this.balance = balance;
		idNum = numAccounts;
		numAccounts += 1;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getIdNum() {
		return idNum;
	}
	
	static void reset() {
		numAccounts = 0;
	}
	
	@Override
	public String toString() {
		return "Acct. #" + idNum + " has $" + balance;
	}
	
	public void deposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Deposits must have positive values");
		}
		balance += amount;
	}
	
	public double withdraw(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Withdraws must have positive values");
		}
		double remainder = 0;
		if(balance < amount) {
			remainder = amount - balance;
			balance = 0;
		} else {
			balance -= amount;
			remainder = 0;
		}
		
		return remainder;
	}
}
