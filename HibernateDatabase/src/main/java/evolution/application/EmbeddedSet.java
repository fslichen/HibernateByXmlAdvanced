package evolution.application;

import java.util.Set;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class EmbeddedSet {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Student student = (Student) session.get(Student.class, AnySession.id4Find);
		Set<String> states = student.getStates();
		System.out.println(states);
	}
}
