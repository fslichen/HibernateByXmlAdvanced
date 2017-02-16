package evolution.entity;

import lombok.Data;

@Data
// Since one customer can have many orders, the order should contain the customer foreign key.
public class Order {// Many
	private int orderId;
	private Customer customer;
}
