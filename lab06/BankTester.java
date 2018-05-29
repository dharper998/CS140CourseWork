package lab06;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankTester {
	List<BankAccount> accounts;
	List<Object> objects;
	//we can initialize some objects to be used in later tests
	//using the Before keyword ensures this method is called before 
	//the test methods are called
	
	//Please note that this method is rerun before the start of each test,
	//which means the BankAccounts will have their numId's increased 
	//each time the account is called.
	
	//we will fix this issue by adding an @After method, which is run 
	//after each test ends
	@Before
	public void initialize(){
		accounts = new ArrayList<>();
		BankAccount bacc1 = new BankAccount(700.00);
		BankAccount bacc2 = new BankAccount(1000.00);
		SavingsAccount savings1 = new SavingsAccount(750.00, 0.05);
		SavingsAccount savings2 = new SavingsAccount(500.00, 0.02);
		CheckingAccount checking1 = new CheckingAccount(700.00, 10);
		CheckingAccount checking2 = new CheckingAccount(1000.00, 5);
		accounts.add(bacc1);
		accounts.add(savings1);
		accounts.add(checking1);
		accounts.add(savings2);
		accounts.add(bacc2);
		accounts.add(checking2);
		
		objects = new ArrayList<>();
		boolean obj1 = true;
		int obj2 = 17;
		String obj3 = "red";
		BankAccount obj4 = new BankAccount(500.00);
		double obj5 = 70.0;
		int[] obj6 = {7, 5, 5, 2};
		SavingsAccount obj7 = new SavingsAccount(1000.00, 0.05);
		List<Double> obj8 = new ArrayList<>();
		obj8.add(1.0);
		obj8.add(2.0);
		obj8.add(3.0);
		
		objects.add(obj1);
		objects.add(obj2);
		objects.add(obj3);
		objects.add(obj4);
		objects.add(obj5);
		objects.add(obj6);
		objects.add(obj7);
		objects.add(obj8);
		
	}

	@After
	public void resetIdNum(){
		BankAccount.reset();
		accounts.clear();
	}
	
	
	//the @Test is necessary, without it the test will not be run
	@Test
	public void testBankAccDeposit() {
		BankAccount bacc = new BankAccount(700.00);
		bacc.deposit(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see 
			//if the expected and actual value are close enough to equaling one another
			assertEquals(800.00, bacc.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("BankAccount's deposit() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testBankAccWithdraw() {
		BankAccount bacc = new BankAccount(1000.00);
		bacc.withdraw(500);
		try {
			assertEquals(500.00, bacc.getBalance(), 1e-6);
		}
		catch(AssertionError e) {
			System.out.println("BankAccount's withdraw() method failed: " + e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void testBankAccToString() {
		BankAccount bacc = new BankAccount(500.00);
		try {
			assertEquals(bacc.toString(), "Acct. #" + bacc.getIdNum() + " has $" + bacc.getBalance());
		}
		catch(AssertionError e) {
			System.out.println("BankAccount's toString() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testSavingsAccountDepost() {
		SavingsAccount savings = new SavingsAccount(1000.00, 0.05);
		savings.deposit(100.00);
		try {
			assertEquals(1105.00, savings.getBalance(), 1e-6);
		}
		catch(AssertionError e) {
			System.out.println("SavingsAccounts's deposit() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testSavingsAccountToString() {
		SavingsAccount savings = new SavingsAccount(1000.00, 0.5);
		try {
			assertEquals(savings.toString(), "Acct. #" + savings.getIdNum() + " has $" + savings.getBalance() + " @ " + (savings.getRate() * 100.0) + "%");
		}
		catch(AssertionError e) {
			System.out.println("SavingsAccounts's toString() method failed: " + e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void testCheckingAccWithdraw(){
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for(int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see 
			//if the expected and actual value are close enough to equaling one another
			assertEquals(700.00, checking.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("CheckingAccount's withdraw() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testCheckingAccGetWithdrawCount(){
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for(int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two integers, we don't need a third argument 
			//since ints can be checked for equality
			assertEquals(3, checking.getWithdrawCount());
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("CheckingAccount's getWithdrawCount() method failed: " + e.getMessage());
			System.out.println("Make sure you adjust the withdrawCount in your CheckingAccount's withdraw() method!");
			throw e;
		}
	}
	
	@Test
	public void testCheckingAccountToString() {
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		try {
			assertEquals(checking.toString(), "Acct. #" + checking.getIdNum() + " has $" + checking.getBalance() + " (" + checking.getWithdrawCount() + "/" + checking.getWithdrawLimit() + ")");
		}
		catch(AssertionError e) {
			System.out.println("CheckingAccounts's toString() method failed: " + e.getMessage());
			throw e;
		}
	}
	
	//TODO: Add some of your own additional tests. Keep each test in a separate test function.
	//This isolates testing a single method or case to a single testing method. Otherwise, 
	//if you try to do too much testing in one tester method, you could throw an error
	//for a test and never find the errors of the other tests you put in that method. 
	

	@Test
	public void dynamicDispatchPrinting(){
		System.out.println(accounts);
		System.out.println(objects);
		for(BankAccount b : accounts){
			if(b instanceof SavingsAccount){
				System.out.println("SavingsAccount: ");
			}
			else if(b instanceof CheckingAccount){
				System.out.println("CheckingAccount: ");
			}
			//note that we do this as an else block
			//since SavingsAccount and CheckingAccounts are also
			//considered to be instances of BankAccount
			//since they are subclasses of BankAccount.
			else{
				System.out.println("BankAccount: ");
			}
			System.out.println(b);	
		}
	}
	
	@Test
	public void depositLoop() {
		for(BankAccount account : accounts) {
			account.deposit(250);
		}
		try {
			assertEquals(accounts.get(0).toString(), "Acct. #0 has $950.0");
			assertEquals(accounts.get(1).toString(), "Acct. #2 has $1012.5 @ 5.0%");
			assertEquals(accounts.get(2).toString(), "Acct. #4 has $950.0 (0/10)");
			assertEquals(accounts.get(3).toString(), "Acct. #3 has $755.0 @ 2.0%");
			assertEquals(accounts.get(4).toString(), "Acct. #1 has $1250.0");
			assertEquals(accounts.get(5).toString(), "Acct. #5 has $1250.0 (0/5)");
		}
		catch(AssertionError e) {
			System.out.println("An account's toString() method failed: " + e.getMessage());
			throw e;
		}
		for(int i=0;i<=6;i++) {
			for(BankAccount account : accounts) {
				account.withdraw(50.00);
			}
			System.out.println(accounts);
		}
	}
}