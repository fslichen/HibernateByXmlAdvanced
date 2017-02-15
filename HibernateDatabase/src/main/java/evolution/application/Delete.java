package evolution.application;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class Delete {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Student student = new Student();
		student.setId(1941);
		session.delete(student);
		session.getTransaction().commit();
		AnySession.close();// Stop the program.
	}
}
