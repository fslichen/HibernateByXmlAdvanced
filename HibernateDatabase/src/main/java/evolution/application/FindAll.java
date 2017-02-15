package evolution.application;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class FindAll {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Query query = session.createQuery("select s from Student s");
		List<Student> students = query.list();
		System.out.println(students);
	}
}
