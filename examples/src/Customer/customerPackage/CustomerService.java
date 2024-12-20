package customerPackage;

import java.util.List;

public class CustomerService {

	private CustomerDAO dao = new CustomerDAO();
	
	public Customer getCustomer(int id) 
	{
		return dao.get(id);
	}
	
	public List<Customer> getAllCustomers() 
	{
		return dao.getAll();
	}
	
	public Customer addCustomer(Customer c) 
	{
		return dao.insert(c);
	}
}