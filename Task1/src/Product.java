
public class Product {

	private int id;
	private String name;
	private static double price;
	
	// constructor to initialize the variables.
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
    // method to retrieve price of the product.
	public static  double getPrice() {
		return price;
	}

	// getters and setters for accessing variables.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
