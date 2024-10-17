
public class Example {
	
	    public static void main(String[] args) {
	        
	        Product product1 = new Product(1, "Laptop", 1000.00);
	        Product product2 = new Product(2, "Phone", 500.00);

	        
	        User user = new User(1, "John Doe", "john.doe@example.com", null);

	        
	        Order order = new Order(1);

	        
	        order.addProduct(product1);
	        order.addProduct(product2);

	        
	        Payment payment = new Payment(1, order.getTotalPrice(), "Credit Card");
	        payment.makePayment();

	        
	        order.setPayment(payment);

	        order.updateStatus(OrderStatus.COMPLETED);

	        user.addOrder(order);

	        for (Order o : user.getOrders()) {
	            System.out.println("Order ID: " + o.getId() + ", Total Price: " + o.getTotalPrice() + ", Status: " + o.getStatus());
	        }
	    }
	}

