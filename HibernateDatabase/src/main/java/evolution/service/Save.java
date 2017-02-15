package evolution.service;

import org.hibernate.Session;
import org.junit.Test;

import evolution.AnySession;
import evolution.entity.Student;

public class Save {
	public void anyMethod() {
		// Create an object.
		Student student = new Student();
		student.setId(((Long) Math.round(Math.random() * 10000)).intValue());
		student.setName("Elsa");
		student.setAge(26);
		student.setGender("F");
		// Apply hibernate
		Session session = AnySession.getSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		// Close resouces.
		AnySession.close();
	}
	
	@Test
	public void test() {
		anyMethod();
	}
}
