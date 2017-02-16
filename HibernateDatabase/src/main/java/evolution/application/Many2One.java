package evolution.application;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Customer;
import evolution.entity.Order;

public class Many2One {// One customer can have many orders, therefore order should have the customer foreign key.
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Customer customer = new Customer();
		customer.setName("Chen");
		Order order0 = new Order();
		order0.setCustomer(customer);
		Order order1 = new Order();
		order1.setCustomer(customer);
		session.save(customer);// Save the customer first unless you use cascade because it is the foreign key of the order.
		session.save(order0);
		session.save(order1);
		session.getTransaction().commit();
		AnySession.close();
	}
}
