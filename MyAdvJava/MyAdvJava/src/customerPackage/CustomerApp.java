package customerPackage;

import java.util.List;

public class CustomerApp {
	
	public static void main(String[] args) {
		
		CustomerService cs = new CustomerService();
		Customer c = new Customer("Sam", Customer.Status.Normal);
		//Customer c2 = new Customer(10, "Joe", Customer.Status.Privileged);
		cs.addCustomer(c);
		
		List<Customer> customers = cs.getAllCustomers();
		
			
		for (Customer cust : customers) {
			System.out.println(cust);
		}
	}
}
