package evolution.application;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class Update {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		// Hibernate updates all the attributes, it will be better to find the object first. 
		Student student = (Student) session.get(Student.class, 1887);
		student.setId(1887);
		student.setName("Anna");
		session.update(student);
		session.getTransaction().commit();
	}
}
