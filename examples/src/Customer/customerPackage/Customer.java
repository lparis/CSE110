package customerPackage;

public class Customer {
	
	public enum Status {
		Privileged,
		Normal,
		Restricted
	}
	
	private int id;
	private String name;
	private Status status;

	public Customer()
	{
		// Default empty constructor
	}

	// Custom constructor
	public Customer(int id, String name, Status status)
	{
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	// Custom constructor
	public Customer(String name, Status status)
	{
		this.name = name;
		this.status = status;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString()
	{
		return "Customer [Customer ID = " + id + ", Customer Name = " + name + ", Customer Status = " + status + "]";
	}
	
}
