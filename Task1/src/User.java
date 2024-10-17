import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String name;
	private String email;
	private List<Order> orders;
	
	
	
	public User(int id, String name, String email, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.orders =new ArrayList<>();
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public List<Order> getOrders(){
		return orders;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
