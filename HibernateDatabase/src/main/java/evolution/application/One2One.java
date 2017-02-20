package evolution.application;

import org.hibernate.Session;
import org.junit.Test;

import evolution.AnySession;
import evolution.entity.Husband;
import evolution.entity.Wife;

public class One2One {
	@Test
	public void test1() {
		Session session = AnySession.getSession();
		
		Husband husband = new Husband();
		husband.setName("Ben");

		Wife wife = new Wife();
		wife.setName("Sally");
		
		husband.setWife(wife);
		wife.setHusband(husband);
		
		session.save(husband);
		
		session.getTransaction().commit();

		AnySession.close();
	}
}
