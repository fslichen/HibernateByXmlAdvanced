package evolution.application;

import org.hibernate.Session;
import org.junit.Test;

import evolution.AnySession;
import evolution.entity.Wife;
import evolution.entity.Husband;

public class One2One {
	@Test
	public void test() {
		Session session = AnySession.getSession();
		Husband husband = new Husband();
		husband.setName("Bob");
		Wife wife = new Wife();
		wife.setName("Elsa");
		husband.setWife(wife);
		wife.setHusband(husband);
		session.save(husband);
		session.getTransaction().commit();
		AnySession.close();
	}
}
