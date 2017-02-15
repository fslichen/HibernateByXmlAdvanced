package evolution.application;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;
import evolution.util.AnyUtil;

public class Save {
	public static void main(String[] args) {
		// Create an object.
		Student student = new Student();
		student.setId(AnyUtil.randomInt());
		student.setName("Elsa");
		student.setAge(26);
		student.setGender("F");
		// Apply hibernate
		Session session = AnySession.getSession();
		session.save(student);
		session.getTransaction().commit();
		// Close resouces.
		AnySession.close();
	}
}
