package customerPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDAO {
	
	private List<Customer> customers = new ArrayList<>();
	private static int nextId = 0;
	
	public Customer get(int id) 
	{
		for (Customer c : customers) 
		{
			if(c.getId() == id) 
			{
				return c;
			}
		}
		
		return null;
	}
	

	public List<Customer> getAll() {
		return customers;
		// return Collections.unmodifiableList(customers)
	}
	
	public Customer insert(Customer c) 
	{
		int id = ++nextId;
		// c = new Customer(id, c.getName(), c.getStatus());
		c.setId(id);
		customers.add(c);
		
		return c;
	}

}
