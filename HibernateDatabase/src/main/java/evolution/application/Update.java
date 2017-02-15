package evolution.application;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class Update {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		// Hibernate updates all the attributes, it will be better to find the object first. 
		Student student = (Student) session.get(Student.class, AnySession.id4Find);
		student.setName("Voldemort");
		session.update(student);
		session.getTransaction().commit();
	}
}
