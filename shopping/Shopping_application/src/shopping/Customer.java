package shopping;

public class Customer {
	private String custUserName;
	private String custPassword;
	public Customer(String custUserName, String custPassword) {
		super();
		this.custUserName = custUserName;
		this.custPassword = custPassword;
	}
	public String getCustUserName() {
		return custUserName;
	}
	public void setCustUserName(String custUserName) {
		this.custUserName = custUserName;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	
}
