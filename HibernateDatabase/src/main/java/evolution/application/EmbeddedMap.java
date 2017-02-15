package evolution.application;

import java.util.Map;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class EmbeddedMap {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Student student = (Student) session.get(Student.class, AnySession.id4Find);
		Map<String, String> statesAndCities = student.getStatesAndCities();
		System.out.println(statesAndCities);
	}
}
