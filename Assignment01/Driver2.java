package assignment01;
public class Driver2 {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane Smith", 100.0);
		System.out.println(cust);
		Customer cust2 = new Customer("John Smith", 150.0);
		System.out.println(cust.hasMoreFundsThan(cust2));
		Customer cust3 = new Customer("James Smith", 50.0);
		System.out.println(cust.hasMoreFundsThan(cust3));
	}
}