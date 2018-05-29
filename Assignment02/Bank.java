package assignment02;

public class Bank {
	private Customer[] customers = new Customer[2000];
	public void createTestAccounts() {
		for(int i=0; i<2000; i++){
			customers[i] = new Customer("Name" + i, 100+Math.random()*10000);
		}
	}

	public double computeInterestToPay(double rate) {
		double totalInterest = 0.0;
		for(Customer c : customers) {
			if(c.getBalance() < 1000) {
				totalInterest += c.getBalance() * (rate/1200);
			} else {
				totalInterest += c.getBalance() * (1.5 * rate/1200);
			}
		}
		return totalInterest;
	}
}
