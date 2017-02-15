package evolution.application;

import java.util.List;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class EmbeddedList {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Student student = (Student) session.get(Student.class, AnySession.id4Find);
		List<String> addresses = student.getAddresses();
		System.out.println(addresses);
	}
}
