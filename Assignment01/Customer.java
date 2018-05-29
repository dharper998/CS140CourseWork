package assignment01;

public class Customer {
	private String customerName;
	BankAccount account;
	
	public Customer(String cName) {
		customerName = cName;
		account = new BankAccount();
	}
	
	public Customer(String cName, double bal) {
		customerName = cName;
		account = new BankAccount(bal);
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public double getBalance() {
		return account.getBalance();
	}
	
	public void deposit(double amount) {
		account.deposit(amount);
	}
	
	public void withdraw(double amount) {
		account.withdraw(amount);
	}
	
	public String toString() { 
		return (customerName + " has " + this.getBalance() + " dollars.");
	}
	
	public boolean hasMoreFundsThan(Customer other) {
		if(this.getBalance() > other.getBalance()) {
			return true;
		}
		else{
			return false;
		}
	}
}