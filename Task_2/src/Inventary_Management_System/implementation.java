package Inventary_Management_System;
import java.util.HashMap;
import java.util.Map;

public class implementation {
	
	

	    private Map<String, Integer> inventory;

	    public implementation() {
	        inventory = new HashMap<>();
	    }

	    //method for Adding a product to the inventory with its stock level
	    public void addProduct(String productName, int stockLevel) {
	        inventory.put(productName, stockLevel);
	    }

	    // method for processing the orders 
	    
	    public void processOrders(Map<String, Integer> orders) {
	        for (Map.Entry<String, Integer> order : orders.entrySet()) {
	            String product = order.getKey();
	            int orderQuantity = order.getValue();

	            if (!inventory.containsKey(product)) {
	                System.out.println("Error: Product '" + product + "' not found in inventory.");
	                continue;
	            }

	            int currentStock = inventory.get(product);

	            if (currentStock < orderQuantity) {
	                System.out.println("Error: Insufficient stock for '" + product + "'. Only " + currentStock + " units available.");
	            } else {
	                inventory.put(product, currentStock - orderQuantity);
	                System.out.println("Order processed for '" + product + "'. New stock level: " + (currentStock - orderQuantity));

	                
	                if (inventory.get(product) < 10) {
	                    System.out.println("Alert: Stock for '" + product + "' is below threshold. Please restock.");
	                }
	            }
	        }
	    }

	    // method for restocking the products which are below threshold value
	   
	    public void restockItems(Map<String, Integer> restockItems) {
	        for (Map.Entry<String, Integer> restock : restockItems.entrySet()) {
	            String product = restock.getKey();
	            int restockQuantity = restock.getValue();

	            if (!inventory.containsKey(product)) {
	                System.out.println("Error: Product '" + product + "' not found in inventory.");
	                continue;
	            }

	            int currentStock = inventory.get(product);
	            inventory.put(product, currentStock + restockQuantity);
	            System.out.println("Restocked '" + product + "'. New stock level: " + inventory.get(product));
	        }
	    }
	    // Example implementation for testing purpose
             
		/*
		 * public static void main(String[] args) { 
		 * implementation ims = new implementation();
		 * 
		 * // Adding products to inventory
		 * 
		 * ims.addProduct("Product_1", 50);
		 * ims.addProduct("Product_2", 8);
		 * ims.addProduct("Product_3", 20);
		 * 
		 * // Sales orders
		 *  Map<String, Integer> orders = new HashMap<>();
		 * orders.put("Product_1", 5); orders.put("Product_2", 3);
		 * orders.put("Product_3",15);
		 * 
		 * // Processing orders 
		 * ims.processOrders(orders);
		 * 
		 * // Restocks items 
		 * Map<String, Integer> restockItems = new HashMap<>();
		 * restockItems.put("Product_2", 20);
		 * ims.restockItems(restockItems);
		 *  }
		 */	
	    
}



