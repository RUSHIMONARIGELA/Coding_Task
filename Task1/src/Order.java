import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private OrderStatus status;
	private double totalPrice;
	private List<Product> products;
	private Payment payment;
	
	
	public Order(int id) {
		super();
		this.id = id;
		this.status = OrderStatus.PENIDNG;
		this.products = new ArrayList<>();
		this.totalPrice = 0.0;
		
	}
	
	public void addProduct(Product product) {
		products.add(product);
		totalPrice += Product.getPrice();
	}

	 public void setPayment(Payment payment) {
	        this.payment = payment;
	    }
	 
	 public void updateStatus(OrderStatus status) {
	        this.status = status;
	    }
	 public double getTotalPrice() {
	        return totalPrice;
	    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}





}
