package shopping;

public class Product {
	private int prodId;
	private String prodName;
	private String description;
	private double rate;
	public Product(int prodId, String prodName,  double rate, String description) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.rate = rate;
		this.description = description;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
