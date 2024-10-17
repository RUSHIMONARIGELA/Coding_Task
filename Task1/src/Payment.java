
public class Payment {

	private int id;
	private double amount;
	private String method;
	
	
	
	public Payment(int id, double amount, String method) {
		super();
		this.id = id;
		this.amount = amount;
		this.method = method;
	}



	public boolean makePayment() {
		System.out.println("Processing payment of " + amount + " using " + method);
        return true;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public String getMethod() {
		return method;
	}



	public void setMethod(String method) {
		this.method = method;
	}
	
}

